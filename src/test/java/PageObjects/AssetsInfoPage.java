package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.Button;
import PageObjects.PageElements.ResultList;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.Text;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsInfoPage extends AssetsPage implements INavigation, ITopLeftBar, ITopRightBar, IAssetsDetails {

    public AssetInfoIdentificationFields identificationFields = new AssetInfoIdentificationFields(driver);
    public AssetInfoVesselFields vesselFields = new AssetInfoVesselFields(driver);
    public AssetsInfoPage(WebDriver driver) {
        super(driver);
    }
    public Button showOnMap = new Button(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.toolbox-wrapper.ng-star-inserted > div > button"));
    public RouterLink editAsset = new RouterLink(driver, By.className("edit-link"));

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