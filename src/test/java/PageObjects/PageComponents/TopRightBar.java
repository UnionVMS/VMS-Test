package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopRightBar extends ComponentBase {

    public RouterLink admin = new RouterLink(driver, By.cssSelector("li.ng-star-inserted > a:nth-child(1)"));
    public RouterLink logout = new RouterLink(driver, By.cssSelector("ul.navbar-nav:nth-child(3) > li:nth-child(1) > a:nth-child(1)"));

    public TopRightBar(WebDriver driver) {
        super(driver);
    }
}