package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OldLoginPage extends PageBase {

    public OldLoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameLocator = By.id("userId");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.xpath("//*[@id='content']/div[1]/div[3]/div/div[2]/div[3]/div[2]/form/div[3]/div/button");

    public OldLoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public OldLoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public OldReportsPage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new OldReportsPage(driver);
    }

    public OldReportsPage loginAs(String username, String password) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        typeUsername(username);
        typePassword(password);
        return submitLogin();
    }
}