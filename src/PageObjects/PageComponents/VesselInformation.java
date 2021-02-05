package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VesselInformation extends ComponentBase {

    public VesselInformation(WebDriver driver) {
        super(driver);
    }
    public ListRow flagState = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow externalMarking = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow cfr = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow ircs = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow imo = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow mmsi = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Image vesselImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
}