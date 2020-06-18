package PageActions;

import PageObjects.*;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import Utilities.Constants;
import org.openqa.selenium.WebDriver;

public class Navigate {
    WebDriver driver;

    public Navigate(WebDriver driver) {
        this.driver = driver;
    }

    public PageBase navigateTo(INavigation currentPage, Constants.MenuItem menuItem) {
        switch(menuItem) {
            case ASSETS: {
                currentPage.getNavigationBar().assets.click();
                return new AssetsPage(driver);
            }
            case REALTIMEMAP: {
                currentPage.getNavigationBar().realtimeMap.click();
                return new RealTimeMapPage(driver);
            }
            case REPORTSMAP: {
                currentPage.getNavigationBar().reportsMap.click();
                return new ReportsPage(driver);
            }
            case MYSETTINGS: {
                currentPage.getNavigationBar().mySettings.click();
                return new SettingsPage(driver);
            }
            default: {
                System.out.println("Unknown navigation item");
                return null;
            }
        }
    }

    public PageBase navigateToAdmin(ITopRightBar currentPage) {
        currentPage.getTopRightBar().admin.click();
        return new OldReportsPage(driver);
    }

    public PageBase navigateToHome(ITopLeftBar currentPage) {
        currentPage.getTopLeftBar().home.click();
        return new HomePage(driver);
    }
}
