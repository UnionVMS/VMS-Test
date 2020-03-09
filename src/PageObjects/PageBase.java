package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import static Utilities.Constants.pageLoadTimeout;

public abstract class PageBase {
    protected final WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
    }

    By logoutLocator = By.linkText("Logout");
    By bodyLocator = By.cssSelector("body");

    public String GetTitle() {
        return driver.getTitle();
    }

    public String GetURL() {
        return  driver.getCurrentUrl();
    }

    public String GetHost() {
        URI uri = null;
        try {
            uri = new URI(driver.getCurrentUrl());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri != null ? uri.getHost() : "";
    }

    public String GetPath() {
        URI uri = null;
        try {
            uri = new URI(driver.getCurrentUrl());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri != null ? uri.getPath() : "";
    }

    protected void setValueInDropdown(By fieldLocator, By rowLocator, By bodyLocator, boolean enabled) {

        driver.findElement(fieldLocator).click();

        WebElement countryRow = driver.findElement(rowLocator);
        if (countryRow.getAttribute("aria-selected").equals(String.valueOf(!enabled)));
        {
            countryRow.click();
        }

        driver.findElement(bodyLocator).click();
    }

    public void Logout() {
        driver.findElement(bodyLocator).click();
        driver.findElement(logoutLocator).click();
    }
}
