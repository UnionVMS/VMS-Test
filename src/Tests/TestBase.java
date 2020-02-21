package Tests;

import PageObjects.OldLoginPage;
import PageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract class TestBase {

    public static WebDriver driver;

    private static String username = "vms_admin_se";
    private static String password = "password";
    private static String loginURL = "http://liaswf05u:28080/unionvms/#/login";

    protected static PageBase testPage;

    protected void setUpBeforeTestClass(){
        //setting the driver executable
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\lib\\selenium\\chromedriver.exe");

        //Initiating your chromedriver
        driver = new ChromeDriver();

        //Applied wait time
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //maximize window
        driver.manage().window().maximize();
    }

    protected void setUpBeforeTestMethod() {
        // initialize testPage
        // login to the app, if necessary

        OldLoginPage lp = new OldLoginPage(driver);
        driver.get(loginURL);
        lp.typeUsername(username);
        lp.typePassword(password);
        testPage = lp.submitLogin();

    }

    protected void tearDownAfterTestMethod() {
        // logout of the app, if necessary
    }

    protected void tearDownAfterTestClass() {
        // close connections, close browser as needed
        driver.close();
    }
}