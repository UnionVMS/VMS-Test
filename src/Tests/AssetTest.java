package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

abstract class AssetTest extends TestBase {


/*    @BeforeClass
    public static void setUpBeforeTestClass(){
        // no changes needed
     }*/

    @Before
    public void setUpBeforeTestMethod() {
        // do the parent actions, then add some post-specific actions
        super.setUpBeforeTestMethod();

    }

    @After
    public void tearDownAfterTestMethod() {
        // logout of the app, if necessary
        super.tearDownAfterTestMethod();
    }

/*    @AfterClass
    public static void tearDownAfterTestClass() {
        // close connections, close browser as needed
    }*/

}
