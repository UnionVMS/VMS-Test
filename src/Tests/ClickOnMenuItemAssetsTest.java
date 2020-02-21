package Tests;

import PageObjects.AssetsPage;
import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;
import org.junit.Test;

public class ClickOnMenuItemAssetsTest extends AssetTest {

    public ClickOnMenuItemAssetsTest() {

        super.setUpBeforeTestClass();

    }

    @Test
    public AssetsPage ClickOnMenuItemAssets (){
        // test is ready to go!
        super.setUpBeforeTestMethod();
        OldAssetPage oldAssetPage = (OldAssetPage) testPage;
        testPage = oldAssetPage.clickMenuItemRealtime();

        RealTimeMapPage realTimeMapPage = (RealTimeMapPage) testPage;
        testPage = realTimeMapPage.clickMenuItemAssets();

        //assert testPage.GetTitle().equals("Assets page");
        System.out.println(testPage.GetTitle());

        return (AssetsPage) testPage;
    }
}
