package Tests;

import PageObjects.OldAssetPage;
import PageObjects.RealTimeMapPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

import static Utilities.Constants.sleepBeforeTestMethod;

abstract class AssetTest extends TestBase {


/*    @BeforeAll
    public static void setUpBeforeTestClass(){
        //super.setUpBeforeTestMethod();
        // no changes needed
        System.out.println("AT BeforeAll");
     }*/

    @BeforeEach
    public void setUpBeforeTestMethod() {
        // do the parent actions, then add some post-specific actions
        System.out.println("AT BeforeEach");
        super.setUpBeforeTestMethod();

        OldAssetPage oldAssetPage = (OldAssetPage) testPage;

        testPage = oldAssetPage.clickMenuItemRealtime();

        RealTimeMapPage realTimeMapPage = (RealTimeMapPage) testPage;

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*        try {
            driver.manage().timeouts().wait(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        // TODO remove hard coded timeouts
        try {
            TimeUnit.MILLISECONDS.sleep(sleepBeforeTestMethod);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testPage = realTimeMapPage.clickMenuItemAssets();

    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        // logout of the app, if necessary
        System.out.println("AT AfterEach");
        super.tearDownAfterTestMethod();

    }

/*    @AfterAll
    public static void tearDownAfterTestClass() {
        // close connections, close browser as needed
//        super.tearDownAfterTestMethod();
        System.out.println("AT AfterAll");

    }*/

}
