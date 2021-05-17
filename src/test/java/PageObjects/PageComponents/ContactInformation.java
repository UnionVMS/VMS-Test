package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.ResultListRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInformation extends ComponentBase {

    public ContactInformation(WebDriver driver) {
        super(driver);
    }
    public ResultListRow header = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow email = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow country = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow city = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow phoneNumber = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow zipCode = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Image vesselImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
}