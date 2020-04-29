package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.Settings;
import PageObjects.AssetsPage;
import PageObjects.SettingsPage;
import Utilities.Constants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        Settings settings = new Settings();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settings.resetToDefault(settingsPage.settingsSubmitBar);
        settings.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS), is(equalTo(false)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS), is(equalTo(true)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES), is(equalTo(false)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS), is(equalTo(false)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS), is(equalTo(true)));
        assertThat(settings.getZoomLevel(settingsPage.mapStartPositionOptions), is(equalTo("10")));
        assertThat(settings.getLatitude(settingsPage.mapStartPositionOptions), is(equalTo("57.6806116")));
        assertThat(settings.getLongitude(settingsPage.mapStartPositionOptions), is(equalTo("12.1047925")));
        assertThat(settings.getTrackLength(settingsPage.tracksAndForecastsOptions), is(equalTo("6 hours")));
        assertThat(settings.getForecastInterval(settingsPage.tracksAndForecastsOptions), is(equalTo("30")));
        assertThat(settings.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(SHIPTYPE)));
        assertThat(settings.getUnitOfDistance(settingsPage.shipOptions), is(equalTo("Metric")));
    }

    @Test
    public void resetToDefaultsWithoutSavingAndThenVerifySettingKept() {
        Navigate navigate = new Navigate(driver);
        Settings settings = new Settings();
        SettingsPage settingsPage = (SettingsPage) testPage;

        boolean oldShowFlags = settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS);
        boolean oldShowTracks = settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS);
        boolean oldShowNames = settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES);
        boolean oldShowSpeeds = settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS);
        boolean oldShowForecasts = settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS);
        String oldZoomLevel = settings.getZoomLevel(settingsPage.mapStartPositionOptions);
        String oldLatitude = settings.getLatitude(settingsPage.mapStartPositionOptions);
        String oldLongitude = settings.getLongitude(settingsPage.mapStartPositionOptions);
        String oldTrackLength = settings.getTrackLength(settingsPage.tracksAndForecastsOptions);
        String oldForecastInterval = settings.getForecastInterval(settingsPage.tracksAndForecastsOptions);
        ShipColourLogic oldShipColourLogic = settings.getSelectedShipColourLogic(settingsPage.shipOptions);
        String oldUnitOfDistance = settings.getUnitOfDistance(settingsPage.shipOptions);

        settings.resetToDefault(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFLAGS), is(equalTo(oldShowFlags)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWTRACKS), is(equalTo(oldShowTracks)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWNAMES), is(equalTo(oldShowNames)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWSPEEDS), is(equalTo(oldShowSpeeds)));
        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, SHOWFORECASTS), is(equalTo(oldShowForecasts)));
        assertThat(settings.getZoomLevel(settingsPage.mapStartPositionOptions), is(equalTo(oldZoomLevel)));
        assertThat(settings.getLatitude(settingsPage.mapStartPositionOptions), is(equalTo(oldLatitude)));
        assertThat(settings.getLongitude(settingsPage.mapStartPositionOptions), is(equalTo(oldLongitude)));
        assertThat(settings.getTrackLength(settingsPage.tracksAndForecastsOptions), is(equalTo(oldTrackLength)));
        assertThat(settings.getForecastInterval(settingsPage.tracksAndForecastsOptions), is(equalTo(oldForecastInterval)));
        assertThat(settings.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(oldShipColourLogic)));
        assertThat(settings.getUnitOfDistance(settingsPage.shipOptions), is(equalTo(oldUnitOfDistance)));
    }
}

