package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.Settings;
import PageObjects.RealTimeMapPage;
import PageObjects.SettingsPage;
import Tests.TestBase;
import Utilities.Constants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract class SettingsTest extends TestBase {


    @BeforeEach
    public void setUpBeforeTestMethod() {
        super.setUpBeforeTestMethod();
        Navigate navigate = new Navigate(driver);

        testPage =  navigate.navigateTo((RealTimeMapPage)testPage, Constants.MenuItem.MYSETTINGS);
        SettingsPage currentPage = (SettingsPage) testPage;
        Settings settings = new Settings();
        settings.resetMapVisibilityOptions(currentPage.mapVisibilityOptions);
        settings.resetMapStartPositionOptions(currentPage.mapStartPositionOptions);
        settings.resetTracksAndForecastsOptions(currentPage.tracksAndForecastsOptions);
        settings.resetShipOptions(currentPage.shipOptions);
        settings.submit(currentPage.settingsSubmitBar);
    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        super.tearDownAfterTestMethod();

    }
}
