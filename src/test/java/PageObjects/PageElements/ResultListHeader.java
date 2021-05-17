package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultListHeader {
    private By elementLocator;
    private WebDriver driver;
    private String name;

    public ResultListHeader(WebDriver driver, By elementLocator, String name) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getValue() {
        return driver.findElement(elementLocator).getText();
    }
}