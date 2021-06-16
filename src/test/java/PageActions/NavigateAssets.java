package PageActions;

import PageObjects.*;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import Utilities.Constants;
import org.openqa.selenium.WebDriver;

public class NavigateAssets {
    WebDriver driver;

    public NavigateAssets(WebDriver driver) {
        this.driver = driver;
    }

    public PageBase navigateTo(IAssetsDetails currentPage, Constants.AssetsMenuItem assetsMenuItem) {
        switch (assetsMenuItem) {
            case ASSETINFO: {
                currentPage.getAssetDetailsNavigation().assetInfo.click();
                return new AssetsInfoPage(driver);
            }
            case MOBILETERMINAL: {
                currentPage.getAssetDetailsNavigation().mobileTerminal.click();
                return new MobileTerminalsPage(driver);
            }
            case CONTACTS: {
                currentPage.getAssetDetailsNavigation().contact.click();
                return new AssetsContactsPage(driver);
            }
            case NOTES: {
                currentPage.getAssetDetailsNavigation().notes.click();
                return new AssetsNotesPage(driver);
            }
            case LASTPOSITIONS: {
                currentPage.getAssetDetailsNavigation().lastPositions.click();
                return new AssetsLastPositionPage(driver);
            }
            default: {
                System.out.println("Unknown navigation item");
                return null;
            }
        }
    }
}
