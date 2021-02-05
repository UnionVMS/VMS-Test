package PageObjects.PageComponents;

import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetMetrics extends ComponentBase {

    public TextBox lengthOverAll = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"), "1");
    public TextBox lengthBetweenPerp = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[1]/div/div[1]/div/input"), "56.114376");
    public TextBox tonnage = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");
    public SelectElement port = new SelectElement(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[1]/div/div[1]/div/input"), "56.114376");
    public TextBox mainPower = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");

    public AssetMetrics(WebDriver driver) {
        super(driver);
    }
}