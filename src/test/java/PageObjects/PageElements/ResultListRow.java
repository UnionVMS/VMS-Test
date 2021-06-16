package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultListRow {
    private By elementLocator;
    private WebDriver driver;

    public ResultListRow(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void click() {
        driver.findElement(elementLocator).click();
    }

        public String getText(int columnIndex) {
       // todo fix just to get a specific column

        return driver.findElement(elementLocator).getText();
    }
}