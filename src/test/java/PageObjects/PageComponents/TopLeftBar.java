package PageObjects.PageComponents;

import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopLeftBar extends ComponentBase {

    public RouterLink home = new RouterLink(driver, By.cssSelector(".navbar-brand"));
    public Text version = new Text(driver, By.cssSelector(".app-version"));

    public TopLeftBar(WebDriver driver) {
        super(driver);
    }
}