package Tests;

import DataModels.AssetData;
import PageObjects.AssetsPage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@RunWith(Parameterized.class)
//@ExtendWith(SpringExtension.class)
public class CreateNewAssetTest extends AssetTest {

    private AssetData assetData;

    public CreateNewAssetTest() {
       // super.setUpBeforeTestClass();
    }

/*    @Parameters
    public static String[] assetFiles() {
        return new String[] { "Asset_01", "Asset_02", "Asset_03" };
    }*/

    @BeforeEach
    public void setUpBeforeTestMethod() {
        System.out.println("CNAT BeforeEach");
        // initialize testPage
        // login to the app, if necessary
        super.setUpBeforeTestMethod();

    }

    @ParameterizedTest
    @ValueSource(strings = { "Asset_01", "Asset_02", "Asset_03" })
    public void CreateNewAsset (String dataFile) throws IOException {

//        @Test
//        public void CreateNewAsset () throws IOException {
        // test is ready to go!
        assetData = AssetData.get(dataFile);

        AssetsPage assetsPage = (AssetsPage) testPage;
        assetsPage.createNewAsset(assetData);
        assertTrue(true) ;
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
*/

    }
}
