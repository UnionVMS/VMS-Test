package Tests;

import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;

public class ClickOnMenuItemRealtimeTest extends AssetTest {

    public ClickOnMenuItemRealtimeTest() {
        super.setUpBeforeTestClass();
    }
    public RealTimeMapPage ClickOnMenuItemRealtime (){
        // test is ready to go!
        super.setUpBeforeTestMethod();
        OldAssetPage currentpage = (OldAssetPage) testPage;
        testPage = currentpage.clickMenuItemRealtime();
        assert testPage.GetTitle().equals("Realmap page");
        return (RealTimeMapPage) testPage;
    }
}
