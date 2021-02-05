package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class List {
    private By elementLocator;
    private WebDriver driver;

    public List(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void clickSorting(String headerName) {
        driver.findElement(elementLocator).click();
    }

    public String getSelectedRow() {
        return driver.findElement(elementLocator).getText();
    }
}