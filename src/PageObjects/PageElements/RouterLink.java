package PageObjects.PageElements;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RouterLink {
    private By elementLocator;
    private WebDriver driver;

    public RouterLink(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void click() {
        driver.findElement(elementLocator).click();
    }

    public boolean isActive() {
        return driver.findElement(elementLocator).getCssValue("routerlinkactive").equals("active");
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }
}