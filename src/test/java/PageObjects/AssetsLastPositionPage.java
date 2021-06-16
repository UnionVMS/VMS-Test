package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.SelectElement;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsLastPositionPage extends AssetsPage implements INavigation, ITopLeftBar, ITopRightBar, IAssetsDetails {

    public SelectElement coordinateSystem = new SelectElement(driver, By.cssSelector("mat-select"), "DDM");
    public PositionsList positions = new PositionsList(driver);
    public RouterLink exportToCsv = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-positions-page > asset-show-positions > button"));

    public AssetsLastPositionPage(WebDriver driver) {
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