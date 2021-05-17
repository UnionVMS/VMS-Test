package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.SettingsActions;
import PageObjects.AssetsPage;
import PageObjects.SettingsPage;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static Utilities.Constants.MapVisibilityOptionsEnum.*;
import static Utilities.Constants.ShipColourLogic.*;
import static Utilities.Constants.ShipColourLogic;

public class SettingsPageTest extends SettingsTest {

    public SettingsPageTest() {
    }

    @Test
    public void resetToDefaultsAndThenVerifySettingSaved() {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.resetToDefault(settingsPage.settingsSubmitBar);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS), is(equalTo(false)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS), is(equalTo(true)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES), is(equalTo(false)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS), is(equalTo(false)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS), is(equalTo(true)));
        assertThat(settingsActions.getZoomLevel(settingsPage.mapStartPositionOptions), is(equalTo("10")));
        assertThat(settingsActions.getLatitude(settingsPage.mapStartPositionOptions), is(equalTo("57.6806116")));
        assertThat(settingsActions.getLongitude(settingsPage.mapStartPositionOptions), is(equalTo("12.1047925")));
        assertThat(settingsActions.getTrackLength(settingsPage.tracksAndForecastsOptions), is(equalTo("6 hours")));
        assertThat(settingsActions.getForecastInterval(settingsPage.tracksAndForecastsOptions), is(equalTo("30")));
        assertThat(settingsActions.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(SHIPTYPE)));
        assertThat(settingsActions.getUnitOfDistance(settingsPage.shipOptions), is(equalTo("Metric")));
    }

    @Test
    public void resetToDefaultsWithoutSavingAndThenVerifySettingKept() {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        boolean oldShowFlags = settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS);
        boolean oldShowTracks = settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS);
        boolean oldShowNames = settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES);
        boolean oldShowSpeeds = settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS);
        boolean oldShowForecasts = settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS);
        String oldZoomLevel = settingsActions.getZoomLevel(settingsPage.mapStartPositionOptions);
        String oldLatitude = settingsActions.getLatitude(settingsPage.mapStartPositionOptions);
        String oldLongitude = settingsActions.getLongitude(settingsPage.mapStartPositionOptions);
        String oldTrackLength = settingsActions.getTrackLength(settingsPage.tracksAndForecastsOptions);
        String oldForecastInterval = settingsActions.getForecastInterval(settingsPage.tracksAndForecastsOptions);
        ShipColourLogic oldShipColourLogic = settingsActions.getSelectedShipColourLogic(settingsPage.shipOptions);
        String oldUnitOfDistance = settingsActions.getUnitOfDistance(settingsPage.shipOptions);

        settingsActions.resetToDefault(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS), is(equalTo(oldShowFlags)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS), is(equalTo(oldShowTracks)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES), is(equalTo(oldShowNames)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS), is(equalTo(oldShowSpeeds)));
        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS), is(equalTo(oldShowForecasts)));
        assertThat(settingsActions.getZoomLevel(settingsPage.mapStartPositionOptions), is(equalTo(oldZoomLevel)));
        assertThat(settingsActions.getLatitude(settingsPage.mapStartPositionOptions), is(equalTo(oldLatitude)));
        assertThat(settingsActions.getLongitude(settingsPage.mapStartPositionOptions), is(equalTo(oldLongitude)));
        assertThat(settingsActions.getTrackLength(settingsPage.tracksAndForecastsOptions), is(equalTo(oldTrackLength)));
        assertThat(settingsActions.getForecastInterval(settingsPage.tracksAndForecastsOptions), is(equalTo(oldForecastInterval)));
        assertThat(settingsActions.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(oldShipColourLogic)));
        assertThat(settingsActions.getUnitOfDistance(settingsPage.shipOptions), is(equalTo(oldUnitOfDistance)));
    }
}

