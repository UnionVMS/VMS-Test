package PageObjects.PageComponents;

import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetMetrics extends ComponentBase {

    public TextBox lengthOverAll = new TextBox(driver, By.cssSelector("input[formcontrolname='lengthOverAll']"), "14");
    public TextBox lengthBetweenPerp = new TextBox(driver, By.cssSelector("input[formcontrolname='lengthBetweenPerpendiculars']"), "20");
    public TextBox tonnage = new TextBox(driver, By.cssSelector("input[formcontrolname='grossTonnage']"), "99");
    public SelectElement unit = new SelectElement(driver, By.cssSelector("mat-select[formcontrolname='grossTonnageUnit']"), "London");
    public TextBox mainPower = new TextBox(driver, By.cssSelector("input[formcontrolname='powerOfMainEngine']"), "99");

    public AssetMetrics(WebDriver driver) {
        super(driver);
    }
}