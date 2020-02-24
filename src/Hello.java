import PageObjects.RealTimeMapPage;
import Tests.ClickOnMenuItemAssetsTest;
import Tests.ClickOnMenuItemRealtimeTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertTrue;

public class Hello {

    public static void main(String[] args) {

/*
/*      // Old python tests
        wait_for_element_by_id_to_exist(wait, "userId", "userId checked 0")
        time.sleep(1)
        self.driver.find_element_by_id("userId").send_keys(defaultUserName)
        self.driver.find_element_by_id("password").send_keys(defaultUserNamePassword)
        time.sleep(1)
        self.driver.find_element_by_xpath("//*[@id='content']/div[1]/div[3]/div/div[2]/div[3]/div[2]/form/div[3]/div/button").click()
        time.sleep(2)
        try:
        self.driver.find_element_by_partial_link_text(defaultContext).click()
*/
/*
        OldLoginPage lp = new OldLoginPage(driver);
        driver.get(loginURL);
        lp.typeUsername("vms_admin_se");
        lp.typePassword("password");
        lp.submitLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://liaswf05u:28080/map/realtime");
        System.out.println(lp.GetTitle());
        assertTrue("".equals(driver.getTitle()));
*/
//        ClickOnMenuItemRealtimeTest myTest = new ClickOnMenuItemRealtimeTest();
//        myTest.ClickOnMenuItemRealtime();

//        ClickOnMenuItemAssetsTest myTest2 = new ClickOnMenuItemAssetsTest();
//        myTest2.ClickOnMenuItemAssets();

        Result result = JUnitCore.runClasses(ClickOnMenuItemAssetsTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());

    }
}