import Tests.ClickOnMenuItemAssetsTest;
import Tests.CreateNewAssetTest;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.PrintWriter;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

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

/*        Result result = JUnitCore.runClasses(ClickOnMenuItemAssetsTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());*/

/*        result = JUnitCore.runClasses(CreateNewAssetTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());
*/

/*
        SummaryGeneratingListener listener2 = new SummaryGeneratingListener();
        LauncherDiscoveryRequest request2 = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(ClickOnMenuItemAssetsTest.class))
                .build();
        Launcher launcher2 = LauncherFactory.create();
//        TestPlan testPlan = launcher.discover(request);
        launcher2.registerTestExecutionListeners(listener2);
        launcher2.execute(request2);

        TestExecutionSummary summary2 = listener2.getSummary();
        summary2.printTo(new PrintWriter(System.out));

*/


        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(CreateNewAssetTest.class))
                .build();
        Launcher launcher = LauncherFactory.create();
//        TestPlan testPlan = launcher.discover(request);
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));

    }
}