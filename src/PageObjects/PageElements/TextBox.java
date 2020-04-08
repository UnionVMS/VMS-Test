package PageObjects.PageElements;

import PageObjects.OldLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
    private By elementLocator;
    private WebDriver driver;

    public TextBox(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public void type(String inputText) {
        WebElement we = driver.findElement(elementLocator);
        we.clear();
        we.sendKeys(inputText);
    }

    public String getText() {
        return driver.findElement(elementLocator).getText();
    }
}