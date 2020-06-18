package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class PageBase {
    public final WebDriver driver;

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

    public void Logout() {
        driver.findElement(bodyLocator).click();
        driver.findElement(logoutLocator).click();
    }
}
