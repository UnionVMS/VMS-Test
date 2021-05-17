package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetDetailsNavigation extends ComponentBase {

    public RouterLink assetInfo = new RouterLink(driver, By.cssSelector("ul.navbar-nav:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
    public RouterLink mobileTerminal = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(2) > a:nth-child(1)"));
    public RouterLink contact = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(3) > a:nth-child(1)"));
    public RouterLink notes = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(4) > a:nth-child(1)"));
    public RouterLink lastPositions = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(4) > a:nth-child(1)"));

    public AssetDetailsNavigation(WebDriver driver) {
        super(driver);
    }
}