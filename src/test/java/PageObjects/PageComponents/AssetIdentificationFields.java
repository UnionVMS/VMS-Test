package PageObjects.PageComponents;

import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetIdentificationFields extends ComponentBase {

    public TextBox cfr = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"), "1");
    public TextBox ircs = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[1]/div/div[1]/div/input"), "56.114376");
    public TextBox imo = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");
    public TextBox homePort = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");
    public TextBox mmsi = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");

    public AssetIdentificationFields(WebDriver driver) {
        super(driver);
    }
}