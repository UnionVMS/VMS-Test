package Tests.AssetTests;

import API.APIUtils;
import API.AssetModule.AssetService;
import DataModels.AssetData;
import DataModels.ContactData;
import Database.DBUtils;
import PageActions.Login;
import PageActions.Navigate;
import PageActions.Search;
import PageActions.SettingsActions;
import PageObjects.AssetsPage;
import PageObjects.HomePage;
import PageObjects.RealTimeMapPage;
import PageObjects.SettingsPage;
import PageResults.SettingsResult;
import PageResults.SystemInfo;
import Utilities.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static Utilities.Constants.MapVisibilityOptionsEnum.*;

public class ViewContactsTest extends AssetTest {

    private AssetData assetData;

    public ViewContactsTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "Asset_01", "Asset_02", "Asset_03"})
    public void CreateNewAsset (String dataFile) throws IOException {

        // TODO This test is used as experimental test during refactoring. It does not make any sense yet.
        assetData = AssetData.get(dataFile);
        assetData.randomizeData();
        String createdAsset = AssetService.CreateAsset(assetData.toString());
        String createdAssetID = APIUtils.GetNodeValue(createdAsset, "id");

        ContactData contactData = ContactData.get(dataFile + "_Contact");
        AssetService.CreateContact(createdAssetID, contactData.toString());

        AssetsPage assetsPage = (AssetsPage) testPage;

        Search search = new Search();
        Navigate navigate = new Navigate(driver);
        SettingsActions settingsActions = new SettingsActions();
        SettingsResult settingsResult = new SettingsResult();
        Login login = new Login(driver);
        SystemInfo systemInfo = new SystemInfo(driver);

        Map<String, Boolean> countries = new HashMap<>();
        countries.put("SWE", Boolean.TRUE);
        countries.put("DNK", Boolean.TRUE);


/*
        Map<String, String> searchArgs = new HashMap<>();
        searchArgs.put("externalmarkings", "AbelExternal");
        searchArgs.put("name", "AbelName");
        searchArgs.put("cfr", "AbelCFR");
        searchArgs.put("ircs", "AbelIRCS");
*/

        search.searchAssets(assetsPage.assetSearch, countries, "tall", "countries");

        String sysVersion = systemInfo.getSystemVersion((AssetsPage) testPage);
        System.out.println(sysVersion);

        testPage = navigate.navigateTo((AssetsPage) testPage, Constants.MenuItem.MYSETTINGS);

        SettingsPage settingsPage = (SettingsPage) testPage;
        Map<Constants.MapVisibilityOptionsEnum, Boolean> visibilitySettings = new HashMap<>();
        visibilitySettings.put(SHOWFLAGS, Boolean.FALSE);
        visibilitySettings.put(SHOWTRACKS, Boolean.FALSE);
        visibilitySettings.put(SHOWNAMES, Boolean.TRUE);
        visibilitySettings.put(SHOWSPEEDS, Boolean.TRUE);
        visibilitySettings.put(SHOWFORECASTS, Boolean.TRUE);

        settingsActions.setVisibility(settingsPage.mapVisibilityOptions, visibilitySettings);
        settingsActions.setMapStartPosition(settingsPage.mapStartPositionOptions, "5", "58.66666", "13.13131313");
        settingsActions.setTracksAndForecast(settingsPage.tracksAndForecastsOptions, "3 hours", "60");
        settingsActions.setShipOptions(settingsPage.shipOptions, Constants.ShipColourLogic.SIZE, "Nautical mile");
        settingsActions.submit(settingsPage.settingsSubmitBar);
        settingsResult.getSubmitResult(settingsPage.topNotificationBar);
        
        /*
        settingsPage.mapVisibilityOptions.showFlags.setStatus(false);
        settingsPage.mapVisibilityOptions.showForecasts.setStatus(true);
        settingsPage.mapVisibilityOptions.showNames.setStatus(false);
        settingsPage.mapVisibilityOptions.showSpeeds.setStatus(true);
        settingsPage.mapVisibilityOptions.showTracks.setStatus(false);
        settingsPage.mapVisibilityOptions.showFlags.setStatus(true);
        settingsPage.mapVisibilityOptions.showForecasts.setStatus(false);
        settingsPage.mapVisibilityOptions.showNames.setStatus(true);
        settingsPage.mapVisibilityOptions.showSpeeds.setStatus(false);
        settingsPage.mapVisibilityOptions.showTracks.setStatus(true);
*/

        try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        testPage = navigate.navigateToHome((SettingsPage) testPage);

        testPage = navigate.navigateTo((HomePage) testPage, Constants.MenuItem.REALTIMEMAP);
//        testPage = navigate.navigateToAdmin((RealTimeMapPage) testPage);

        login.logout((RealTimeMapPage) testPage);

        int deletedContacts = DBUtils.DeleteContactsBasedOnAssetID(createdAssetID);
        int deletedAssets = DBUtils.DeleteAssetBasedOnCFR(assetData.cfr);
    }
// TODO Hur hantera testdata? Slumpa in värden? Radera efter test? Nollställ efter suite? Kunna testa mot skarp data? Läsa upp data att testa med? DBUnit?
// Lägg till generering av randomnummer baserat på längd. Ha hantering av krockar på ett fint sätt.
// När testsuiten startar om så nollställs databasen.
// Hur göra med test av delad miljö/kopia på proddata? Flagga för att radera data efter test med SQL/API
/*
    # Deactivate SWE filter
        click_on_flag_state_in_list_tab(self, flagStateIndex[2])
    # Enter IRCS in the ircs search field for the newly created asset
        wait_for_element_by_name_to_exist(wait, "ircs", "ircs checked 2")
        time.sleep(defaultSleepTimeValue)
        self.driver.find_element_by_name("ircs").send_keys(ircsValue[vesselNumber])
    # Click on search button
        wait_for_element_by_css_selector_to_exist(wait, ".asset-search-form button[type='submit']",  "CSS Selector checked 3")
        time.sleep(defaultSleepTimeValue)
        self.driver.find_element_by_css_selector(".asset-search-form button[type='submit']").click()
    # Check that the new asset exists in the list.
        wait_for_element_by_css_selector_to_exist(wait, ".asset-table tbody tr:first-child .cdk-column-name", "CSS Selector checked 4")
        time.sleep(defaultSleepTimeValue)
        self.assertEqual(vesselName[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-name").text)
        self.assertEqual(ircsValue[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-ircs").text)
        self.assertEqual(mmsiValue[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-mmsi").text)
        self.assertEqual(countryValue[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-flagstate").text)
        self.assertEqual(externalMarkingValue[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-externalMarking").text)
        self.assertEqual(cfrValue[vesselNumber], self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-cfr").text)
    # Click on details button for new asset
        wait_for_element_by_css_selector_to_exist(wait, ".asset-table tbody tr:first-child .cdk-column-name", "CSS Selector checked 5")
        time.sleep(defaultSleepTimeValue)
        self.driver.find_element_by_css_selector(".asset-table tbody tr:first-child .cdk-column-name").click()
    # Get all elements from the Asset table list and save them in allElements list
        wait_for_element_by_css_selector_to_exist(wait, ".left-column asset-show div", "CSS Selector checked 6")
        time.sleep(defaultSleepTimeValue * 3)
        allElements = self.driver.find_elements_by_css_selector(".left-column asset-show div")
    # Check that the F.S value is correct.
        self.assertEqual(countryValue[vesselNumber], allElements[0].text)
    # Check that External Marking Value is correct
        self.assertEqual(externalMarkingValue[vesselNumber], allElements[1].text)
    # Check that the CFR value is correct
        self.assertEqual(cfrValue[vesselNumber], allElements[2].text)
    # Check that the IRCS value is correct
        self.assertEqual(ircsValue[vesselNumber], allElements[3].text)
    # Check that the IMO value is correct
        self.assertEqual(imoValue[vesselNumber], allElements[4].text)
    # Check that the HomePort value is correct
        self.assertEqual(homeportValue[vesselNumber], allElements[5].text)
    # Check that the MMSI value is correct
        self.assertEqual(mmsiValue[vesselNumber], allElements[6].text)
    # Check that the Length Type over all value is correct.
        self.assertEqual(lengthOverAllValue[vesselNumber], allElements[7].text)
    # Check that the Length Type between perpendiculars value is correct.
        self.assertEqual(lengthBetweenPerpendicularsValue[vesselNumber], allElements[8].text)
    # Check that the Gross Tonnage value PLUS Gross Tonnage type are correct.
        self.assertEqual(grossTonnageValue[vesselNumber] +" " + grossTonnageTypeValue[vesselNumber], allElements[9].text)
    # Check that the Power value is correct.
                self.assertEqual(powerValue[vesselNumber], allElements[10].text)
    # Check that the Product Org Code value is correct.
                self.assertEqual(productOrgCodeValue[vesselNumber], allElements[11].text)
    # Check that the Product Org Name value is correct.
                self.assertEqual(productOrgNameValue[vesselNumber], allElements[12].text)
    # Check that the Name value is correct.left-column asset-show l
        self.assertEqual(vesselName[vesselNumber], self.driver.find_element_by_css_selector("asset-show-page h1").text)
    # Check contact parameters if checkContacts is TRUE
        if checkContacts == True:
        # Get all contacts elements from the Asset table list and save them in allContactsElements list
        wait_for_element_by_css_selector_to_exist(wait, ".left-column asset-show-contacts div", "CSS Selector checked 7")
        time.sleep(defaultSleepTimeValue)
        allContactsElements = self.driver.find_elements_by_css_selector(".left-column asset-show-contacts div")
        # Check that the Contact Name value is correct.
        self.assertEqual(contactNameValue[vesselNumber], allContactsElements[1].text)
        # Check that the E-mail value is correct.
                self.assertEqual(contactEmailValue[vesselNumber], allContactsElements[2].text)
        # Check that the Contact Country value is correct.
        self.assertEqual(contactCountryValue[vesselNumber], allContactsElements[3].text)
        # Check that the Contact City value is correct.
        self.assertEqual(contactCityValue[vesselNumber], allContactsElements[4].text)
        # Check that the Phone value is correct.
                self.assertEqual(contactPhoneNumberValue[vesselNumber], allContactsElements[5].text)
        # Check that the Contact Zip Code value is correct.
                self.assertEqual(contactZipCodeValue[vesselNumber], allContactsElements[6].text)
        # Check that the Type Organization value is correct.
        self.assertEqual(contactTypeValue[vesselNumber], allContactsElements[7].text)
        time.sleep(defaultSleepTimeValue * 10)
*/

/*    def click_on_flag_state_in_list_tab(self, flagState):
            # Set wait time for web driver
    wait = WebDriverWait(self.driver, WebDriverWaitTimeValue)
    # Click on Flagstates field
    wait_for_element_by_css_selector_to_exist(wait, "mat-form-field", "CSS Selector checked 1")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("mat-form-field").click()
    time.sleep(defaultSleepTimeValue)
            # SelectElement/Deselect Flagstate in list
    wait_for_element_by_css_selector_to_exist(wait, "#mat-option-" + flagState + " .mat-option-text", "CSS Selector checked 2")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("#mat-option-" + flagState + " .mat-option-text").click()
    # Click on body surface
    wait_for_element_by_css_selector_to_exist(wait, "body", "CSS Selector checked 3")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("body").click()
*/
}

