package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VesselHeader extends ComponentBase {

    public VesselHeader(WebDriver driver) {
        super(driver);
    }
    public Image flagImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Text vesselHeader = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Text vesselCompany = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public RouterLink editAsset = new RouterLink(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.toolbox-wrapper.ng-star-inserted > div > button"));
}