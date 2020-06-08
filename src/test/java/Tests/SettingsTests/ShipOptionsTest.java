package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.Settings;
import PageObjects.AssetsPage;
import PageObjects.SettingsPage;
import Utilities.Constants;
import Utilities.Constants.ShipColourLogic;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ShipOptionsTest extends SettingsTest {

    public ShipOptionsTest() {
    }

    @ParameterizedTest
    @EnumSource(ShipColourLogic.class)
    public void setShipColourLogicAndThenVerifySettingSaved(ShipColourLogic shipColourLogic) {
        Navigate navigate = new Navigate(driver);
        Settings settings = new Settings();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settings.setShipColourLogic(settingsPage.shipOptions, shipColourLogic);
        settings.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settings.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(shipColourLogic)));
    }
    @ParameterizedTest

    @ValueSource(strings = { "Metric", "Nautical mile"})
    public void setUnitOfDistanceAndThenVerifySettingSaved(String unitOfDistance) {
        Navigate navigate = new Navigate(driver);
        Settings settings = new Settings();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settings.setUnitOfDistance(settingsPage.shipOptions, unitOfDistance);
        settings.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settings.getUnitOfDistance(settingsPage.shipOptions), is(equalTo(unitOfDistance)));
    }
}

