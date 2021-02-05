package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.WebDriver;

public class AssetInformationEditPage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);

    public AssetEssentialFields assetEssentialFields = new AssetEssentialFields(driver);
    public AssetIdentificationFields assetIdentificationFields = new AssetIdentificationFields(driver);
    public AssetMetrics assetMetrics = new AssetMetrics(driver);
    public AssetCompanyInformation assetCompanyInformation = new AssetCompanyInformation(driver);

    public AssetInformationEditPage(WebDriver driver) {
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