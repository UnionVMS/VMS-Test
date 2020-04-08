package PageObjects.PageComponents;

import PageObjects.PageElements.Notification;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopNotificationBar extends ComponentBase {

    public Notification notification = new Notification(driver, By.xpath("//div[@class='container']//core-notifications"));

    public TopNotificationBar(WebDriver driver) {
        super(driver);
    }
}