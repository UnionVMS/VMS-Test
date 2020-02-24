package Tests;

import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;
import org.junit.Test;

public class ClickOnMenuItemRealtimeTest extends AssetTest {

    public ClickOnMenuItemRealtimeTest() {
//        super.setUpBeforeTestClass();
    }

    @Test
    public RealTimeMapPage ClickOnMenuItemRealtime (){
        // test is ready to go!
//        super.setUpBeforeTestMethod();
        OldAssetPage oldAssetPage = (OldAssetPage) testPage;
        testPage = oldAssetPage.clickMenuItemRealtime();
        //assert testPage.GetTitle().equals("Realmap page");
        System.out.println(testPage.GetTitle());

        return (RealTimeMapPage) testPage;
    }
}
