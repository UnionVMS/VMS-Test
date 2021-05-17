package Tests.SettingsTests;

import PageActions.Navigate;
import PageActions.SettingsActions;
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
        SettingsActions settingsActions = new SettingsActions();
        SettingsPage settingsPage = (SettingsPage) testPage;


        Map<MapVisibilityOptionsEnum, Boolean> visibilitySettings = new HashMap<>();
        visibilitySettings.put(checkbox, Boolean.TRUE);
        settingsActions.setVisibility(settingsPage.mapVisibilityOptions, visibilitySettings);
        settingsActions.submit(settingsPage.settingsSubmitBar);

        AssetsPage assetPage = (AssetsPage) navigate.navigateTo(settingsPage, Constants.MenuItem.ASSETS);
        settingsPage = (SettingsPage) navigate.navigateTo(assetPage, Constants.MenuItem.MYSETTINGS);

        assertThat(settingsActions.getMapVisibilityState(settingsPage.mapVisibilityOptions, checkbox), is(equalTo(true)));
    }
}

