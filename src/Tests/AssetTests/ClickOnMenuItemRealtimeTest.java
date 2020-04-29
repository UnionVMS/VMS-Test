package Tests.AssetTests;

import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;
import Tests.AssetTests.AssetTest;
import org.junit.jupiter.api.Test;

public class ClickOnMenuItemRealtimeTest extends AssetTest {

    public ClickOnMenuItemRealtimeTest() {
    }

    @Test
    public RealTimeMapPage ClickOnMenuItemRealtime (){
        OldAssetPage oldAssetPage = (OldAssetPage) testPage;
        testPage = oldAssetPage.clickMenuItemRealtime();
        return (RealTimeMapPage) testPage;
    }
}
