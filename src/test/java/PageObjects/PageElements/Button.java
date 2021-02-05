package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    private By elementLocator;
    private WebDriver driver;

    public Button(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void click() {
        driver.findElement(elementLocator).click();
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }
}