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

public class AssetsSearchPage extends AssetsPage implements INavigation, ITopLeftBar, ITopRightBar, IAssetsDetails {

    String[] columns = new String[]{"ExtMarking","Ircs","Name","CFR","FS","Mmsi"};
    public AssetSearch assetSearch = new AssetSearch(driver);
    public Text resultsFoundText = new Text(driver, By.cssSelector("#mat-input-4"));
    public ResultList searchResultList = new ResultList(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-search-page > div > div > div.asset-container.mat-elevation-z8.ng-star-inserted > div > table"), columns);

    public AssetsSearchPage(WebDriver driver) {
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