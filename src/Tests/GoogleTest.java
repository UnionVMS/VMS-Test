package Tests;

import PageObjects.GoogleHomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;


public class GoogleTest extends TestBase {
    @Test
    public void enterGoogleSearchAndViewResults(WebDriver webDriver) {
        GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
        googleHomePage.openPage();
        googleHomePage.searchText("Selenium", Keys.ENTER);
        Assert.assertEquals("Selenium - Sök på Google", webDriver.getTitle());
    }


    @Test
    public void enterGoogleImageSearch(WebDriver webDriver) {
        GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
        googleHomePage.openPage();
        googleHomePage.searchText("Selenium", Keys.ENTER);
        //googleResultsPage.performImageSearch();
    }
}
