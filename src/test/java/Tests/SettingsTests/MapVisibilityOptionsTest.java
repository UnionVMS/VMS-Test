package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.Settings;
import PageObjects.AssetsPage;
import PageObjects.SettingsPage;
import Utilities.Constants;
import Utilities.Constants.MapVisibilityOptionsEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MapVisibilityOptionsTest extends SettingsTest {

    public MapVisibilityOptionsTest() {
    }

    @ParameterizedTest
    @EnumSource(MapVisibilityOptionsEnum.class)
    public void setMapVisibilityOptionAndThenVerifySettingSaved(MapVisibilityOptionsEnum checkbox) {
        Navigate navigate = new Navigate(driver);
        Settings settings = new Settings();
        SettingsPage settingsPage = (SettingsPage) testPage;


        Map<MapVisibilityOptionsEnum, Boolean> visibilitySettings = new HashMap<>();
        visibilitySettings.put(checkbox, Boolean.TRUE);
        settings.setVisibility(settingsPage.mapVisibilityOptions, visibilitySettings);
        settings.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settings.getMapVisibilityState(settingsPage.mapVisibilityOptions, checkbox), is(equalTo(true)));
    }
}

