package Tests.AssetTests;

import API.APIUtils;
import API.AssetModule.AssetService;
import DataModels.AssetData;
import DataModels.ContactData;
import Database.DBUtils;
import PageActions.*;
import PageObjects.AssetsPage;
import PageObjects.HomePage;
import PageObjects.RealTimeMapPage;
import PageObjects.SettingsPage;
import PageResults.SettingsResult;
import PageResults.SystemInfo;
import Utilities.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static Utilities.Constants.MapVisibilityOptionsEnum.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SearchAssetTest extends AssetTest {

    public SearchAssetTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "SWET_cD0pGYe", "SWET_Jckw9F2", "SWET_CutLVsT"})
    public void searchForCFRAndVerifyValueFound(String searchText) {
        AssetActions assetsActions = new AssetActions();
        Result result = new Result(driver);
        AssetsPage assetsPage = (AssetsPage) testPage;

        assetsActions.search(assetsPage.assetSearch, Constants.AssetSearchOptions.VMSASSETS, searchText, assetsPage.searchResultList);
        assertThat(result.getCellValue(assetsPage.searchResultList, 0, "CFR"), is(equalTo(searchText)));
    }
}

