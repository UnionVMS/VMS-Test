package PageObjects;

import DataModels.AssetData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssetsPage extends PageBase {

    public AssetsPage(WebDriver driver) {
        super(driver);

        // Check that we're on the right page.
/*        if (!"".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }*/
    }

    By countryFieldLocator = By.cssSelector("mat-form-field");
    By countryRowLocator; //= By.cssSelector("#mat-option-" + countryCheckBox + " .mat-option-text");
    By bodyLocator = By.cssSelector("body");


        public AssetsPage setCountryFilter(String country, boolean countryEnabled) {

            countryRowLocator = By.cssSelector("#mat-option-" + country);
            setValueInDropdown(countryFieldLocator, countryRowLocator, bodyLocator, countryEnabled);
        return this;
    }
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

    // driver.findElement(menuItemAssetsLocator).click();

/*    def click_on_flag_state_in_list_tab(self, flagState):
            # Set wait time for web driver
    wait = WebDriverWait(self.driver, WebDriverWaitTimeValue)
    # Click on Flagstates field
    wait_for_element_by_css_selector_to_exist(wait, "mat-form-field", "CSS Selector checked 1")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("mat-form-field").click()
    time.sleep(defaultSleepTimeValue)
            # Select/Deselect Flagstate in list
    wait_for_element_by_css_selector_to_exist(wait, "#mat-option-" + flagState + " .mat-option-text", "CSS Selector checked 2")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("#mat-option-" + flagState + " .mat-option-text").click()
    # Click on body surface
    wait_for_element_by_css_selector_to_exist(wait, "body", "CSS Selector checked 3")
    time.sleep(defaultSleepTimeValue)
            self.driver.find_element_by_css_selector("body").click()
*/


}