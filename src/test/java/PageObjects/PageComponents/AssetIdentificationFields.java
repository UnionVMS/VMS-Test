package PageObjects.PageComponents;

import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetIdentificationFields extends ComponentBase {

    public TextBox cfr = new TextBox(driver, By.cssSelector("input[formcontrolname='cfr']"), "1");
    public TextBox ircs = new TextBox(driver,  By.cssSelector("input[formcontrolname='ircs']"), "56.114376");
    public TextBox imo = new TextBox(driver,  By.cssSelector("input[formcontrolname='imo']"), "15.655957");
    public TextBox homePort = new TextBox(driver,  By.cssSelector("input[formcontrolname='portOfRegistration']"), "15.655957");
    public TextBox mmsi = new TextBox(driver,  By.cssSelector("input[formcontrolname='mmsi']"), "15.655957");

    public AssetIdentificationFields(WebDriver driver) {
        super(driver);
    }
}