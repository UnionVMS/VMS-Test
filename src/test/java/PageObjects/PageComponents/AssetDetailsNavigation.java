package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetDetailsNavigation extends ComponentBase {

    public RouterLink assetInfo = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.side-menu > ul > li:nth-child(6) > span.text"));
    public RouterLink mobileTerminal = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.side-menu > ul > li:nth-child(7) > span.text"));
    public RouterLink contact = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.side-menu > ul > li:nth-child(8) > span.text"));
    public RouterLink notes = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.side-menu > ul > li:nth-child(9) > span.text"));
    public RouterLink lastPositions = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.side-menu > ul > li:nth-child(10) > span.text"));

    public AssetDetailsNavigation(WebDriver driver) {
        super(driver);
    }
}