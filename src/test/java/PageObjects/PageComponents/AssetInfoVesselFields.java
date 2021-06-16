package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.Text;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetInfoVesselFields extends ComponentBase {


    public Text vesselType = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(1) > div.value"));
    public Text portOfRegistration = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(2) > div.value"));
    public Text grossTonnage = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(3) > div.value"));
    public Text powerMainEngine = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(4) > div.value"));
    public Text lengthOverAll = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(5) > div.value"));
    public Text lengthBetween = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(6) > div.value"));
    public Image vesselImage = new Image(driver, By.cssSelector(".image-wrapper"));


    public AssetInfoVesselFields(WebDriver driver) {
        super(driver);
    }
}