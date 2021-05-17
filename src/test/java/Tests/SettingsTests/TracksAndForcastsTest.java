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

public class TracksAndForcastsTest extends SettingsTest {

    public TracksAndForcastsTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "1 hour", "3 hours", "6 hours", "12 hours", "1 day"})
    public void setTrackLengthAndThenVerifySettingSaved(String trackLength) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setTrackLength(settingsPage.tracksAndForecastsOptions, trackLength);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getTrackLength(settingsPage.tracksAndForecastsOptions), is(equalTo(trackLength)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "1", "10", "60", "3600"})
    public void setForecastIntervalAndThenVerifySettingSaved(String forecastInterval) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setForecastInterval(settingsPage.tracksAndForecastsOptions, forecastInterval);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getForecastInterval(settingsPage.tracksAndForecastsOptions), is(equalTo(forecastInterval)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-100", "0", "11.1", "33,33", "55k", "kalle", "99999999999999"})
    public void setInvalidForecastIntervalAndThenVerifyFail(String forecastInterval) {
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setForecastInterval(settingsPage.tracksAndForecastsOptions, forecastInterval);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        assertThat(settingsPage.tracksAndForecastsOptions.forecastInterval.isValid(), is(false));
    }
}

