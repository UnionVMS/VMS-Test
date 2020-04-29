package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectElement {
    private By elementLocator;
    private WebDriver driver;
    private By bodyLocator = By.cssSelector("body");
    private String defaultValue;

    public SelectElement(WebDriver driver, By elementLocator, String defaultValue) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        this.defaultValue = defaultValue;
    }

    public void setValueInMultiDropdown(By rowLocator, boolean enabled) {

        driver.findElement(elementLocator).click();

        WebElement countryRow = driver.findElement(rowLocator);
        if (!countryRow.getAttribute("aria-selected").equals(String.valueOf(enabled)))
        {
            countryRow.click();
        }

        driver.findElement(bodyLocator).click();
    }

    public void setValueInDropdown(String value) {

//        Select dropdown = new Select(driver.findElement(elementLocator));
//        dropdown.selectByVisibleText(value);
        driver.findElement(elementLocator).click();
        By xpath = By.xpath("//mat-option/span[contains(text(),'" + value + "')]");
//        By xpath = By.xpath("//mat-option[span[text()[contains(.,'{optionName}')]]]");

        driver.findElement(xpath).click();
        }
// By.xpath("//span[text()='Settings']")
//        driver.findElement(By.xpath("//mat-option/span[contains(.,'" + countryName + "')]")).click();
//        dropdown.selectByVisibleText(value);  //*[@id="mat-option-251"]/span


    public void selectCountry(String countryName)
    {
        driver.findElement(By.id("mat-select-5")).click();
        driver.findElement(By.xpath("//mat-option/span[contains(.,'" + countryName + "')]")).click();
    }

    public void resetToDefault() {
        setValueInDropdown(defaultValue);
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getValue() {
        return driver.findElement(elementLocator).getText();
    }

/*    public void click() {
        driver.findElement(elementLocator).click();
    }

    public boolean isActive() {
        return driver.findElement(elementLocator).getCssValue("routerlinkactive").equals("active");
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }*/
}
