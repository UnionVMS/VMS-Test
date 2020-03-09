package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickOnMenuItemAssetsTest extends AssetTest {

    public ClickOnMenuItemAssetsTest() {
    }

    @Test
    public void ClickOnMenuItemAssets (){
        assertEquals("VmsFrontend", testPage.GetTitle());
        String path = testPage.GetPath();
        assertEquals("/asset", path );
    }
}
