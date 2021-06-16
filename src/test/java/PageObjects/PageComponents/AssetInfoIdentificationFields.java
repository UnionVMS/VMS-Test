package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.Text;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetInfoIdentificationFields extends ComponentBase {


    public Image flag = new Image(driver, By.cssSelector(".flag-image"));
    public Text headline = new Text(driver,  By.cssSelector(".title > h2"));
    public Text subline = new Text(driver,  By.cssSelector(".title > span"));
    public Text flagState = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(1) > div.value"));
    public Text extMarking = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(2) > div.value"));
    public Text cfr = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(3) > div.value"));
    public Text ircs = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(4) > div.value"));
    public Text imo = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(5) > div.value"));
    public Text mmsi = new Text(driver,  By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.content-container > div.content-body > div.fields > div:nth-child(6) > div.value"));
    public Image assetImage = new Image(driver,  By.cssSelector(".asset-image"));


    public AssetInfoIdentificationFields(WebDriver driver) {
        super(driver);
    }
}