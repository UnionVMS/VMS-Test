package Tests;

import API.APIUtils;
import API.AssetModule.AssetService.AssetService;
import DataModels.AssetData;
import DataModels.ContactData;
import Database.DBUtils;
import PageObjects.AssetsPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.IOException;

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

/*    @BeforeEach
    public void setUpBeforeTestMethod() {
        System.out.println("CNAT BeforeEach");
        // initialize testPage
        // login to the app, if necessary
        super.setUpBeforeTestMethod();

    }*/

    @ParameterizedTest
    @ValueSource(strings = { "Asset_01", "Asset_02" })
    public void CreateNewAsset (String dataFile) throws IOException {

        assetData = AssetData.get(dataFile);
        assetData.randomizeData();
        String createdAsset = AssetService.CreateAsset(assetData.toString());
        String createdAssetID = APIUtils.GetNodeValue(createdAsset, "id");

        ContactData contactData = ContactData.get(dataFile + "_Contact");
        AssetService.CreateContact(createdAssetID, contactData.toString());

        AssetsPage assetsPage = (AssetsPage) testPage;
        //assertTrue(true);

        int deletedContacts = DBUtils.DeleteContactsBasedOnAssetID(createdAssetID);
        int deletedAssets = DBUtils.DeleteAssetBasedOnCFR(assetData.cfr);



// TODO Hur hantera testdata? Slumpa in värden? Radera efter test? Nollställ efter suite? Kunna testa mot skarp data? Läsa upp data att testa med? DBUnit?
// Lägg till generering av randomnummer baserat på längd. Ha hantering av krockar på ett fint sätt.
// När testsuiten startar om så nollställs databasen.
// Hur göra med test av delad miljö/kopia på proddata? Flagga för att radera data efter test med SQL/API


        }
    }

