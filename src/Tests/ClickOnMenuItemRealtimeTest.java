package Tests;

import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;
import org.junit.Test;

public class ClickOnMenuItemRealtimeTest extends AssetTest {

    public ClickOnMenuItemRealtimeTest() {
        super.setUpBeforeTestClass();
    }

    @Test
    public RealTimeMapPage ClickOnMenuItemRealtime (){
        // test is ready to go!
        super.setUpBeforeTestMethod();
        OldAssetPage currentpage = (OldAssetPage) testPage;
        testPage = currentpage.clickMenuItemRealtime();
        assert testPage.GetTitle().equals("Realmap page");
        return (RealTimeMapPage) testPage;
    }
}
