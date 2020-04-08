package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends ComponentBase {

    public RouterLink assets = new RouterLink(driver, By.cssSelector("ul.navbar-nav:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
    public RouterLink realtimeMap = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(2) > a:nth-child(1)"));
    public RouterLink reportsMap = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(3) > a:nth-child(1)"));
    public RouterLink mySettings = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(4) > a:nth-child(1)"));

    public NavigationBar(WebDriver driver) {
        super(driver);
    }
}