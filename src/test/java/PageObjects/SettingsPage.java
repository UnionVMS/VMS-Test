package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.WebDriver;

public class SettingsPage extends PageBase implements INavigation, ITopRightBar, ITopLeftBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);
    public MapVisibilityOptions mapVisibilityOptions = new MapVisibilityOptions(driver);
    public MapStartPositionOptions mapStartPositionOptions = new MapStartPositionOptions(driver);
    public TracksAndForecastsOptions tracksAndForecastsOptions = new TracksAndForecastsOptions(driver);
    public ShipOptions shipOptions = new ShipOptions(driver);
    public SettingsSubmitBar settingsSubmitBar = new SettingsSubmitBar(driver);
    public TopNotificationBar topNotificationBar = new TopNotificationBar(driver);

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    //todo: Ska vi skippa alla get-metoder?

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

    public MapVisibilityOptions getMapVisibilityOptions() {
        return mapVisibilityOptions;
    }
    public MapStartPositionOptions getMapStartPositionOptions() {
        return mapStartPositionOptions;
    }
    public TracksAndForecastsOptions getTracksAndForecastsOptions() {
        return tracksAndForecastsOptions;
    }
    public ShipOptions getShipOptions() {
        return shipOptions;
    }
    public SettingsSubmitBar getSettingsSubmitBar() {
        return settingsSubmitBar;
    }
    public TopNotificationBar getTopNotificationBar() {
        return topNotificationBar;
    }

}