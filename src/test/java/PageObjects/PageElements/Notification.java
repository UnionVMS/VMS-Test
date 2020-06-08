package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Notification {
    private By elementLocator;
    private WebDriver driver;

    public Notification(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }

    public String getMessage() {
        return driver.findElement(elementLocator).findElement(By.xpath("//span")).getText();
    }
}