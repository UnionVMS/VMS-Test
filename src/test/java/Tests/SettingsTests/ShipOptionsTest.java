package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.SettingsActions;
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
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setShipColourLogic(settingsPage.shipOptions, shipColourLogic);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getSelectedShipColourLogic(settingsPage.shipOptions), is(equalTo(shipColourLogic)));
    }
    @ParameterizedTest

    @ValueSource(strings = { "Metric", "Nautical mile"})
    public void setUnitOfDistanceAndThenVerifySettingSaved(String unitOfDistance) {
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;

        settingsActions.setUnitOfDistance(settingsPage.shipOptions, unitOfDistance);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getUnitOfDistance(settingsPage.shipOptions), is(equalTo(unitOfDistance)));
    }
}

