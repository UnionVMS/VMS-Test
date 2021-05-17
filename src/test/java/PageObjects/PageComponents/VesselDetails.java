package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.ResultListRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VesselDetails extends ComponentBase {

    public VesselDetails(WebDriver driver) {
        super(driver);
    }
    public ResultListRow vesselType = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow portOfRegistration = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow grossTonnage = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow powerOfEngine = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow lengthOverAll = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ResultListRow lengthBetweenPerp = new ResultListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Image vesselImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
}