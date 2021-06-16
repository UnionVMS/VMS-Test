package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.ResultList;
import PageObjects.PageElements.Text;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);
    public MobileSearch mobileSearch = new MobileSearch(driver);
    public MobileTerminalsDetailsNavigation mobileTerminalsDetailsNavigation = new MobileTerminalsDetailsNavigation(driver);
    public Text resultsFoundText = new Text(driver, By.cssSelector("#mat-input-4"));

    String[] columns = new String[]{"ExtMarking","Ircs","Name","CFR","FS","Mmsi"};
    public ResultList searchResultList = new ResultList(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-search-page > div > div > div.asset-container.mat-elevation-z8.ng-star-inserted > div > table"), columns);



    public MobilePage(WebDriver driver) {
        super(driver);
    }




    public MobileTerminalsDetailsNavigation getMobileDetailsNavigation() {
        return mobileTerminalsDetailsNavigation;
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