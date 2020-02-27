package PageObjects;

import DataModels.AssetData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsPage extends PageBase {

    public AssetsPage(WebDriver driver) {
        super(driver);

        // Check that we're on the right page.
/*        if (!"".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }*/
    }

    // The locators for these elements should only be defined once.
    By menuItemAssetsLocator = By.linkText("Assets");

    public AssetsPage createNewAsset(AssetData assetData) {


        // ToDo: Enter data into corresponding elements



        /*
 # Get Token
        token = get_token_from_usm()
    # Create Asset via REST
        dataBody = {'grossTonnageUnit': grossTonnageTypeValue[vesselNumber]}
        dataBody.setdefault('flagStateCode', countryValue[vesselNumber])
        dataBody.setdefault('ircs', ircsValue[vesselNumber])
        dataBody.setdefault('name', vesselName[vesselNumber])
        dataBody.setdefault('externalMarking', externalMarkingValue[vesselNumber])
        dataBody.setdefault('cfr', cfrValue[vesselNumber])
        dataBody.setdefault('imo', imoValue[vesselNumber])
        dataBody.setdefault('portOfRegistration', homeportValue[vesselNumber])
        dataBody.setdefault('mmsi', mmsiValue[vesselNumber])
        dataBody.setdefault('lengthOverAll', lengthOverAllValue[vesselNumber])
        dataBody.setdefault('lengthBetweenPerpendiculars', lengthBetweenPerpendicularsValue[vesselNumber])
        dataBody.setdefault('grossTonnage', grossTonnageValue[vesselNumber])
        dataBody.setdefault('grossTonnageUnit', grossTonnageTypeValue[vesselNumber])
        dataBody.setdefault('powerOfMainEngine', powerValue[vesselNumber])
        dataBody.setdefault('prodOrgName', productOrgNameValue[vesselNumber])
        dataBody.setdefault('prodOrgCode', productOrgCodeValue[vesselNumber])
        print(dataBody)
        url = httpUrlRestAssetString
        rsp = create_post_via_rest(token, dataBody, url)
        print(rsp)
        print(rsp.text)
        assetId = get_key_value_of_respone(rsp, "id")
        print("id :", assetId)
    # Create Contact via REST
        dataBody = {'assetId': assetId}
        dataBody.setdefault('name', contactNameValue[vesselNumber])
        dataBody.setdefault('type', contactTypeValue[vesselNumber])
        dataBody.setdefault('email', contactEmailValue[vesselNumber])
        dataBody.setdefault('phoneNumber', contactPhoneNumberValue[vesselNumber])
        dataBody.setdefault('country', contactCountryValue[vesselNumber])
        dataBody.setdefault('cityName', contactCityValue[vesselNumber])
        dataBody.setdefault('zipCode', contactZipCodeValue[vesselNumber])
        url = httpUrlRestAssetString + "/contacts"
        rsp = create_post_via_rest(token, dataBody, url)
        print(rsp)
        print(rsp.text)
        time.sleep(defaultSleepTimeValue)

 def get_token_from_usm():
    # Get Token
    url = httpUSMUrlString
    datas = {"userName": defaultUserName, "password": defaultUserNamePassword}
    headers = {'Content-type': 'application/json'}
    rsp = requests.post(url, json=datas, headers=headers)
    token = rsp.json()['jwtoken']
    return token


def create_post_via_rest(token, dataBody, url):
    # Create Asset vis REST
    headers = {'Authorization': token, 'Cache-Control': 'no-cache'}
    rsp = requests.post(url, json=dataBody, headers=headers)
    return rsp


             */




       // driver.findElement(menuItemAssetsLocator).click();

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimver) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return this;
    }

}