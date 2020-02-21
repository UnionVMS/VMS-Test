package Tests;

abstract class AssetTest extends TestBase {


    protected void setUpBeforeTestClass(){
        // no changes needed
        super.setUpBeforeTestClass();
    }

    protected void setUpBeforeTestMethod() {
        // do the parent actions, then add some post-specific actions
        super.setUpBeforeTestMethod();

    }
    protected void tearDownAfterTestMethod() {
        // logout of the app, if necessary
    }

    protected void tearDownAfterTestClass() {
        // close connections, close browser as needed
    }

}
