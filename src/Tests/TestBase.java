package Tests;

import PageActions.Login;
import PageObjects.LoginPage;
import PageObjects.PageBase;
import Utilities.Constants;
import Utilities.LazyWebDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static Utilities.Constants.*;


public abstract class TestBase {

    public static WebDriver driver;

    protected static PageBase testPage;

    public static class TestResources {
        protected void before() {
            // Setup logic that used to be in @BeforeClass
            //setting the driver executable
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\lib\\selenium\\chromedriver.exe");

            //Initiating your chromedriver
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--window-position=(-200),0 --secondary-display-layout=(l, -100)");
            driver = new LazyWebDriver(new ChromeDriver(chromeOptions), lazyWebTimeout);

        }
        protected void after() {
            driver.close();
        }
    }

    @BeforeAll
    public static void setUpBeforeTestClass(){

        TestResources res = new TestResources();
        res.before();
    }

    @BeforeEach
    public void setUpBeforeTestMethod() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get(Constants.loginURL);
        Login login = new Login(driver);

        testPage = login.loginWith(loginPage.login, username, password);
    }

    @AfterEach
    public void tearDownAfterTestMethod() {
        testPage.Logout();

    }

    @AfterAll
    public static void tearDownAfterTestClass() {
        TestResources res = new TestResources();
        res.after();
    }
}