package PageObjects.PageComponents;

import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetEssentialFields extends ComponentBase {

    public TextBox flagState = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"), "1");
    public TextBox externalMarking = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[1]/div/div[1]/div/input"), "56.114376");
    public TextBox name = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");

    public AssetEssentialFields(WebDriver driver) {
        super(driver);
    }
}