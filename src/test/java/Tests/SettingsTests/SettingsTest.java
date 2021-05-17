package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.SettingsActions;
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
        SettingsActions settingsActions = new SettingsActions();
        settingsActions.resetMapVisibilityOptions(currentPage.mapVisibilityOptions);
        settingsActions.resetMapStartPositionOptions(currentPage.mapStartPositionOptions);
        settingsActions.resetTracksAndForecastsOptions(currentPage.tracksAndForecastsOptions);
        settingsActions.resetShipOptions(currentPage.shipOptions);
        settingsActions.submit(currentPage.settingsSubmitBar);
    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        super.tearDownAfterTestMethod();

    }
}
