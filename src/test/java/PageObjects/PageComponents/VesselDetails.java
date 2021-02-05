package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.ListRow;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VesselDetails extends ComponentBase {

    public VesselDetails(WebDriver driver) {
        super(driver);
    }
    public ListRow vesselType = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow portOfRegistration = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow grossTonnage = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow powerOfEngine = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow lengthOverAll = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow lengthBetweenPerp = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Image vesselImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
}