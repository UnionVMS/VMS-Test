package PageObjects.PageComponents;

import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetEssentialFields extends ComponentBase {

    public SelectElement flagState = new SelectElement(driver, By.cssSelector("mat-select[formcontrolname='flagState']"), "SWE");
    public TextBox externalMarking = new TextBox(driver, By.cssSelector("input[formcontrolname='externalMarking']"), "EXT99");
    public TextBox name = new TextBox(driver, By.cssSelector("input[formcontrolname='name']"), "AbelShip99");

    public AssetEssentialFields(WebDriver driver) {
        super(driver);
    }
}