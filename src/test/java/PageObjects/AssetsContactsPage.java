package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.Button;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsContactsPage extends AssetsPage implements INavigation, ITopLeftBar, ITopRightBar, IAssetsDetails {

    public AssetContactsFields assetContactsFields = new AssetContactsFields(driver);
    public AssetsContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AssetDetailsNavigation getAssetDetailsNavigation() {
        return super.assetDetailsNavigation;
    }

    @Override
    public NavigationBar getNavigationBar() {
        return super.navigationBar;
    }

    @Override
    public TopLeftBar getTopLeftBar() {
        return super.topLeftBar;
    }

    @Override
    public TopRightBar getTopRightBar() {
        return super.topRightBar;
    }



}