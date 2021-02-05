package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListRow {
    private By elementLocator;
    private WebDriver driver;

    public ListRow(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }


    public String getText(String header) {
        return driver.findElement(elementLocator).getText();
    }
}