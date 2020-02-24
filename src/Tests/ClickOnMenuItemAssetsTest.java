package Tests;

        import PageObjects.AssetsPage;
        import PageObjects.OldAssetPage;
        import PageObjects.RealTimeMapPage;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class ClickOnMenuItemAssetsTest extends AssetTest {

    public ClickOnMenuItemAssetsTest() {

       // super.setUpBeforeTestClass();

    }

    @Test
    public void ClickOnMenuItemAssets (){
        // test is ready to go!
//        super.setUpBeforeTestMethod();
        OldAssetPage oldAssetPage = (OldAssetPage) testPage;

        testPage = oldAssetPage.clickMenuItemRealtime();

        RealTimeMapPage realTimeMapPage = (RealTimeMapPage) testPage;
        testPage = realTimeMapPage.clickMenuItemAssets();

//        ((OldAssetPage)testPage).clickMenuItemRealtime();
//        ((RealTimeMapPage)testPage).clickMenuItemAssets();

        assertEquals("Assets page", testPage.GetTitle());
        System.out.println(testPage.GetTitle());

        return;
    }
}
