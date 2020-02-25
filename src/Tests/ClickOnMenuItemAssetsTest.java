package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickOnMenuItemAssetsTest extends AssetTest {

    public ClickOnMenuItemAssetsTest() {

       // super.setUpBeforeTestClass();

    }

    @Test
    public void ClickOnMenuItemAssets (){
        // test is ready to go!
//        super.setUpBeforeTestMethod();

//        ((OldAssetPage)testPage).clickMenuItemRealtime();
//        ((RealTimeMapPage)testPage).clickMenuItemAssets();

//        String t = testPage.GetTitle();
        System.out.println(testPage.GetTitle());

//        String e = "Assets page";
        assertEquals("VmsFrontend", testPage.GetTitle());
//        Assert.assertEquals(e, t);

        String path = testPage.GetPath();
        System.out.println(path);
        assertEquals("/asset", path );

    }
}
