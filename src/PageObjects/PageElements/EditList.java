package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditList {
    private By elementLocator;
    private WebDriver driver;

    public EditList(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }


    public String getSelectedRow() {
        return driver.findElement(elementLocator).getText();
    }
}