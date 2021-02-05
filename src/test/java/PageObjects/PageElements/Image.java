package PageObjects.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Image {
    private By elementLocator;
    private WebDriver driver;


    public Image(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
    }

    public String getImageName() {
        return driver.findElement(elementLocator).getText();
    }


}