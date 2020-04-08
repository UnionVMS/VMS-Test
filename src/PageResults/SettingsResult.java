package PageResults;

import PageObjects.PageComponents.TopNotificationBar;
import PageObjects.PageInterfaces.ITopLeftBar;
import org.openqa.selenium.WebDriver;

public class SettingsResult {

    public SettingsResult() {

    }

    public String getSubmitResult(TopNotificationBar currentPage) {
        return currentPage.notification.getMessage();
    }

}
