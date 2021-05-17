package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultListCell {
    private By elementLocator;
    private WebDriver driver;

    public ResultListCell(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }
}