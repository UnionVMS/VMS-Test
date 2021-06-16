package Tests.AssetTests;

import PageActions.*;
import PageObjects.*;
import Utilities.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        AssetsSearchPage assetsSearchPage = (AssetsSearchPage) testPage;

        assetsActions.search(assetsSearchPage.assetSearch, Constants.AssetSearchOptions.SWEDISHASSETS, searchText, assetsSearchPage.searchResultList);
        assertThat(result.getCellValue(assetsSearchPage.searchResultList, 0, "CFR"), is(equalTo(searchText)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "CFR875224638", "SWET_cD0pGYe" })
    public void searchForCFRAndClickOnAsset(String searchText) {
        AssetActions assetsActions = new AssetActions();
        AssetsSearchPage assetsSearchPage = (AssetsSearchPage) testPage;

        assetsActions.search(assetsSearchPage.assetSearch, Constants.AssetSearchOptions.SWEDISHASSETS, searchText, assetsSearchPage.searchResultList);
        assetsSearchPage.searchResultList.clickRow(0);
        AssetsInfoPage assetsInfoPage = new AssetsInfoPage(driver);
        assetsInfoPage.vesselFields.vesselType.getText();
/*        assetsInfoPage.editAsset.click();
        AssetsEditPage assetsEditPage = new AssetsEditPage(driver);
        assetsEditPage.assetEssentialFields.flagState.setValueInDropdown("SOM");
        assetsEditPage.assetEssentialFields.flagState.setValueInDropdown("SWE");
        assetsEditPage.assetEssentialFields.externalMarking.type("EXT999");
        assetsEditPage.assetEssentialFields.name.type("AbelShip999");
        assetsEditPage.assetIdentificationFields.cfr.type("Test");
        assetsEditPage.assetIdentificationFields.cfr.type("SWET_cD0pGYe");
        assetsEditPage.assetIdentificationFields.ircs.type("Test");
        assetsEditPage.assetIdentificationFields.ircs.type("T_UxTIBk");
        assetsEditPage.assetIdentificationFields.imo.type("Test");
        assetsEditPage.assetIdentificationFields.imo.type("T_LKhHv");
        assetsEditPage.assetIdentificationFields.homePort.type("Test");
        assetsEditPage.assetIdentificationFields.homePort.type("GOT");
        assetsEditPage.assetIdentificationFields.mmsi.type("Test");
        assetsEditPage.assetIdentificationFields.mmsi.type("42342");
        assetsEditPage.assetMetrics.lengthOverAll.type("666");
        assetsEditPage.assetMetrics.lengthBetweenPerp.type("666");
        assetsEditPage.assetMetrics.tonnage.type("666");
        assetsEditPage.assetMetrics.unit.setValueInDropdown("Oslo");
        assetsEditPage.assetMetrics.mainPower.type("666");
        assetsEditPage.assetCompanyInformation.organizationName.type("Abel999");
        assetsEditPage.assetCompanyInformation.organizationNumber.type("666");
        assetsEditPage.save.click();
*/
        assetsInfoPage = new AssetsInfoPage(driver);
        NavigateAssets navigateAssets = new NavigateAssets(driver);
        AssetsContactsPage assetsContactsPage = (AssetsContactsPage) navigateAssets.navigateTo(assetsInfoPage, Constants.AssetsMenuItem.CONTACTS);
//        assetsContactsPage.assetContactsFields.phoneNumber.getText();
        AssetsLastPositionPage assetsLastPositionPage = (AssetsLastPositionPage) navigateAssets.navigateTo(assetsContactsPage, Constants.AssetsMenuItem.LASTPOSITIONS);
        assetsLastPositionPage.positions.lastPositions.refresh();
        assetsLastPositionPage.positions.lastPositions.getHeaders();
    }
}

