package Tests.AssetTests;

import PageActions.Navigate;
import PageObjects.OldReportsPage;
import PageObjects.RealTimeMapPage;
import Tests.TestBase;
import Utilities.Constants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

import static Utilities.Constants.sleepBeforeTestMethod;

abstract class AssetTest extends TestBase {


    @BeforeEach
    public void setUpBeforeTestMethod() {
        super.setUpBeforeTestMethod();
        Navigate navigate = new Navigate(driver);

        testPage =  navigate.navigateTo((RealTimeMapPage)testPage, Constants.MenuItem.ASSETS);

    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        super.tearDownAfterTestMethod();

    }
}
