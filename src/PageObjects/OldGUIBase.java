package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OldGUIBase extends PageBase {

    public OldGUIBase(WebDriver driver) {
        super(driver);
    }

    By menuItemRealtimeLocator = By.id("uvms-header-menu-item-realtime");

    public RealTimeMapPage clickMenuItemRealtime() {
        driver.findElement(menuItemRealtimeLocator).click();

        return new RealTimeMapPage(driver);
    }

}