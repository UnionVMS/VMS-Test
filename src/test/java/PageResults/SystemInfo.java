package PageResults;

import PageObjects.OldReportsPage;
import PageObjects.PageBase;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.WebDriver;

public class SystemInfo {
    WebDriver driver;

    public SystemInfo(WebDriver driver) {
        this.driver = driver;
    }

    public String getSystemVersion(ITopLeftBar currentPage) {
        return currentPage.getTopLeftBar().version.getText();
    }

}
