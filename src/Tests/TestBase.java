package Tests;

import PageObjects.OldLoginPage;
import PageObjects.PageBase;
import Utilities.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {

    public static WebDriver driver;

    protected static PageBase testPage;

//    @ClassRule
//    public static final TestResources res = new TestResources();

    public static class TestResources {
        protected void before() {
            // Setup logic that used to be in @BeforeClass
            //setting the driver executable
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\lib\\selenium\\chromedriver.exe");

            //Initiating your chromedriver
            driver = new ChromeDriver();

            //Applied wait time
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //maximize window
            driver.manage().window().maximize();
        }
        protected void after() {
            // Setup logic that used to be in @AfterClass
            // close connections, close browser as needed
            driver.close();
        }
    }

    @BeforeAll
    public static void setUpBeforeTestClass(){
        System.out.println("TB BeforeAll");

        TestResources res = new TestResources();
        res.before();
    }

    @BeforeEach
    public void setUpBeforeTestMethod() {
        // initialize testPage
        // login to the app, if necessary
        System.out.println("TB BeforeEach");

        OldLoginPage lp = new OldLoginPage(driver);
        driver.get(Constants.loginURL);
        lp.typeUsername(Constants.username);
        lp.typePassword(Constants.password);
        testPage = lp.submitLogin();

    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        // logout of the app, if necessary
        System.out.println("TB AfterEach");
        testPage.Logout();
        //Applied wait time
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void tearDownAfterTestClass() {
        System.out.println("TB AfterAll");

        TestResources res = new TestResources();
        res.after();
    }
}