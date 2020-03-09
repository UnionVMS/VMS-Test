package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RealTimeMapPage extends PageBase {

    public RealTimeMapPage(WebDriver driver) {
        super(driver);
    }

    By menuItemAssetsLocator = By.cssSelector("ul.navbar-nav:nth-child(2) > li:nth-child(1) > a:nth-child(1)");

    public AssetsPage clickMenuItemAssets() {
        driver.findElement(menuItemAssetsLocator).click();
        return new AssetsPage(driver);
    }

}