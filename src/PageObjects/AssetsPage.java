package PageObjects;

import PageObjects.PageComponents.AssetSearch;
import PageObjects.PageComponents.NavigationBar;
import PageObjects.PageComponents.TopLeftBar;
import PageObjects.PageComponents.TopRightBar;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsPage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);
    public AssetSearch assetSearch = new AssetSearch(driver);

    public AssetsPage(WebDriver driver) {
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