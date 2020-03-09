package Tests;

import PageObjects.OldReportsPage;
import PageObjects.RealTimeMapPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

import static Utilities.Constants.sleepBeforeTestMethod;

abstract class AssetTest extends TestBase {


    @BeforeEach
    public void setUpBeforeTestMethod() {
        super.setUpBeforeTestMethod();

        OldReportsPage oldReportsPage = (OldReportsPage) testPage;

        testPage = oldReportsPage.clickMenuItemRealtime();

        RealTimeMapPage realTimeMapPage = (RealTimeMapPage) testPage;

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
        super.tearDownAfterTestMethod();

    }
}
