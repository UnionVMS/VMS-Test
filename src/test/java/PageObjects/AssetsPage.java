package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.ResultList;
import PageObjects.PageElements.Text;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AssetsPage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);
    public AssetDetailsNavigation assetDetailsNavigation = new AssetDetailsNavigation(driver);

    public AssetsPage(WebDriver driver) {
        super(driver);
    }

    public AssetDetailsNavigation getAssetDetailsNavigation() {
        return assetDetailsNavigation;
    }

    @Override
    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    @Override
    public TopLeftBar getTopLeftBar() {
        return topLeftBar;
    }

    @Override
    public TopRightBar getTopRightBar() {
        return topRightBar;
    }


}