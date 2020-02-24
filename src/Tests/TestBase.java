package Tests;

import PageObjects.OldLoginPage;
import PageObjects.PageBase;
import org.junit.*;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;

    private static String username = "vms_admin_se";
    private static String password = "password";
    private static String loginURL = "http://liaswf05u:28080/unionvms/#/login";

    protected static PageBase testPage;

    @ClassRule
    public static final TestResources res = new TestResources();


    public static class TestResources extends ExternalResource {
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



    @BeforeClass
    public static void setUpBeforeTestClass(){
    }

    @Before
    public void setUpBeforeTestMethod() {
        // initialize testPage
        // login to the app, if necessary

        OldLoginPage lp = new OldLoginPage(driver);
        driver.get(loginURL);
        lp.typeUsername(username);
        lp.typePassword(password);
        testPage = lp.submitLogin();

    }

    @After
    public void tearDownAfterTestMethod() {
        // logout of the app, if necessary
    }

    @AfterClass
    public static void tearDownAfterTestClass() {
    }
}