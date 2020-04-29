package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    private By elementLocator;
    private WebDriver driver;

    public RadioButton(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void click() {
        driver.findElement(elementLocator).click();
    }

    public boolean isSelected() {
//        return driver.findElement(elementLocator).isSelected();
        return driver.findElement(elementLocator).getAttribute("class").contains("mat-radio-checked");

    }
    public String getText() {
        return driver.findElement(elementLocator).getText();
    }

}