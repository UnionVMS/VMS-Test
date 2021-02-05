package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.ListRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInformation extends ComponentBase {

    public ContactInformation(WebDriver driver) {
        super(driver);
    }
    public ListRow header = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow email = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow country = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow city = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow phoneNumber = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public ListRow zipCode = new ListRow(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public Image vesselImage = new Image(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
}