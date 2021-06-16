package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.Button;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsEditPage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);

    public AssetEssentialFields assetEssentialFields = new AssetEssentialFields(driver);
    public AssetIdentificationFields assetIdentificationFields = new AssetIdentificationFields(driver);
    public AssetMetrics assetMetrics = new AssetMetrics(driver);
    public AssetCompanyInformation assetCompanyInformation = new AssetCompanyInformation(driver);
    public Button save = new Button(driver, By.id("asset-form--save"));

    public AssetsEditPage(WebDriver driver) {
        super(driver);
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