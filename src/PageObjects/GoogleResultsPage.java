package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends PageBase {

    WebDriver webDriver = null;

    public GoogleResultsPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }


    public void performImageSearch() {
        webDriver.findElement(imageSearch).click();
    }

    public static By imageSearch = By.xpath("//a[contains(text(), 'Images')]");
}