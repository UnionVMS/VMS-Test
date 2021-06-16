package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetCompanyInformation extends ComponentBase {

    public TextBox organizationName = new TextBox(driver, By.cssSelector("input[formcontrolname='prodOrgName']"), "Abel");
    public TextBox organizationNumber = new TextBox(driver, By.cssSelector("input[formcontrolname='prodOrgCode']"), "666");

    public AssetCompanyInformation(WebDriver driver) {
        super(driver);
    }
}