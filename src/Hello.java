import java.util.concurrent.TimeUnit;

import PageObjects.LoginPage;
import Tests.ClickOnMenuItemRealtimeTest;
import Tests.GoogleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Hello {

    public static void main(String[] args) {
// TODO Auto-generated method stub

/*
//setting the driver executable
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\lib\\selenium\\chromedriver.exe");

//Initiating your chromedriver
        WebDriver driver = new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();
*/

/*
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        */
/*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         *//*

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
*/

//        String loginURL = "http://liaswf05u:28080/unionvms/#/login";
/*        driver.get(loginURL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Waited 10");

        WebElement username = driver.findElement(By.id("userId"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//*[@id='content']/div[1]/div[3]/div/div[2]/div[3]/div[2]/form/div[3]/div/button"));

        username.sendKeys("vms_admin_se");
        password.sendKeys("password");
        login.click();
*/
/*
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

//open browser with desired URL
//        driver.get("https://www.google.com");

//closing the browser
        //driver.close();
/*

        GoogleTest gt = new GoogleTest();
        gt.enterGoogleSearchAndViewResults(driver);

        LoginPage lp = new LoginPage(driver);
        driver.get(loginURL);
        lp.typeUsername("vms_admin_se");
        lp.typePassword("password");
        lp.submitLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://liaswf05u:28080/map/realtime");
        System.out.println(lp.GetTitle());
        assertTrue("".equals(driver.getTitle()));
*/
        ClickOnMenuItemRealtimeTest myTest = new ClickOnMenuItemRealtimeTest();
        myTest.ClickOnMenuItemRealtime();
    }

}