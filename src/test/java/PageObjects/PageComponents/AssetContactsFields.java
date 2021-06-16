package PageObjects.PageComponents;

import PageObjects.PageElements.Image;
import PageObjects.PageElements.Text;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetContactsFields extends ComponentBase {

    public Text portOfRegistration = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-show-page > asset-show > div.vessel-details > div.content-container > div > div:nth-child(2) > div.value"));

    public Text headLine = new Text(driver, By.cssSelector("h2"));
    public Text phoneNumber = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > contact-show-by-asset-page > div > div > div.left-block > div > div:nth-child(2)"));
    public Text email = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > contact-show-by-asset-page > div > div > div.left-block > div > div:nth-child(3)"));
    public Text zipCode = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > contact-show-by-asset-page > div > div > div.left-block > div > div:nth-child(4)"));
    public Text country = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > contact-show-by-asset-page > div > div > div.left-block > div > div:nth-child(5)"));
    public Text city = new Text(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > contact-show-by-asset-page > div > div > div.left-block > div > div:nth-child(6)"));
    public Image organizationImage = new Image(driver, By.className("type-icon"));


    public AssetContactsFields(WebDriver driver) {
        super(driver);
    }
}