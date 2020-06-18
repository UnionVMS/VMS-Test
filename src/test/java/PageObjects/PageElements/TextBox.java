package PageObjects.PageElements;

import PageObjects.OldLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
    private By elementLocator;
    private WebDriver driver;
    private String defaultValue;

    public TextBox(WebDriver driver, By elementLocator, String defaultValue) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        this.defaultValue = defaultValue;
    }

    public void type(String inputText) {
        WebElement we = driver.findElement(elementLocator);
        we.clear();
        we.sendKeys(inputText);
    }

    public String getValue() {
        return driver.findElement(elementLocator).getAttribute("value");
    }

    public void resetToDefault() {
        type(defaultValue);
    }

    public boolean isValid() {
        boolean isValid;
        try {
            isValid = !(driver.findElement(elementLocator).getAttribute("aria-invalid").equals("true"));
        } catch (Exception e) {
            return true;
        }
        return isValid;
    }


    public String getDefaultValue() {
        return defaultValue;
    }
}