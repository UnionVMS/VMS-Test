package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private By elementLocator;
    private WebDriver driver;
    private boolean defaultValue;

    public CheckBox(WebDriver driver, By elementLocator, boolean defaultValue) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        this.defaultValue = defaultValue;
    }

    public void click() {
        driver.findElement(elementLocator).click();
    }

    public boolean isEnabled() {
        return driver.findElement(elementLocator).getAttribute("class").contains("mat-checked");
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }

    public void setStatus(boolean state) {
        if (!(isEnabled() == state)) {
            click();
        }
    }
    public void resetToDefault() {
        setStatus(defaultValue);
    }

    public boolean getDefaultValue() {
        return defaultValue;
    }
}