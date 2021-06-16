package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileTerminalsDetailsNavigation extends ComponentBase {

    public RouterLink details = new RouterLink(driver, By.cssSelector("ul.navbar-nav:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
    public RouterLink edit = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(2) > a:nth-child(1)"));
    public RouterLink attachmentsHistory = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(3) > a:nth-child(1)"));
    public RouterLink terminalHistory = new RouterLink(driver, By.cssSelector("li.nav-item:nth-child(4) > a:nth-child(1)"));

    public MobileTerminalsDetailsNavigation(WebDriver driver) {
        super(driver);
    }
}