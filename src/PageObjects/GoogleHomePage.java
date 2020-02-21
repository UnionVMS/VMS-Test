package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends PageBase {

        WebDriver webDriver = null;

public GoogleHomePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
        }


public void openPage() {
        webDriver.navigate().to("http://www.google.com");
        }

public static By searchInput = By.cssSelector("input[title=Sök]");

public void searchText(CharSequence... keys) {
        webDriver.findElement(searchInput).sendKeys(keys);
        }

        }