package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.SettingsActions;
import PageObjects.AssetsPage;
import PageObjects.SettingsPage;
import Utilities.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MapStartPositionTest extends SettingsTest {

    public MapStartPositionTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "2", "10", "19"})
    public void setZoomLevelAndThenVerifySettingSaved(String zoomLevel) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setZoomLevel(settingsPage.mapStartPositionOptions, zoomLevel);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getZoomLevel(settingsPage.mapStartPositionOptions), is(equalTo(zoomLevel)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-1", "20", "1010101010"})
    public void setInvalidZoomLevelAndThenVerifyFail(String zoomLevel) {
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setZoomLevel(settingsPage.mapStartPositionOptions, zoomLevel);

        assertThat(settingsPage.mapStartPositionOptions.zoomLevel.isValid(), is(false));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-89", "89", "0", "55.555", "-55.555"})
    public void setLatitudeAndThenVerifySettingSaved(String latitude) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setLatitude(settingsPage.mapStartPositionOptions, latitude);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getLatitude(settingsPage.mapStartPositionOptions), is(equalTo(latitude)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-100", "-90", "90", "100", "55,555", "-55,555", "kalle", "4k"})
    public void setInvalidLatitudeAndThenVerifyFail(String latitude) {
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setLatitude(settingsPage.mapStartPositionOptions, latitude);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        assertThat(settingsPage.mapStartPositionOptions.startLatitude.isValid(), is(false));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-179", "179", "0", "55.555", "-55.555"})
    public void setLongitudeAndThenVerifySettingSaved(String longitude) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setLongitude(settingsPage.mapStartPositionOptions, longitude);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getLongitude(settingsPage.mapStartPositionOptions), is(equalTo(longitude)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-200", "-180", "180", "200", "55,555", "-55,555", "kalle", "4k"})
    public void setInvalidLongitudeAndThenVerifyFail(String longitude) {
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setLongitude(settingsPage.mapStartPositionOptions, longitude);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        assertThat(settingsPage.mapStartPositionOptions.startLongitude.isValid(), is(false));
    }
}

