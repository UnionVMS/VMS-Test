package PageObjects.PageComponents;

import PageObjects.PageElements.CheckBox;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapStartPositionOptions extends ComponentBase {

    public TextBox zoomLevel = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"), "1");
    public TextBox startLatitude = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[1]/div/div[1]/div/input"), "56.114376");
    public TextBox startLongitude = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/div/mat-form-field[2]/div/div[1]/div/input"), "15.655957");

    public MapStartPositionOptions(WebDriver driver) {
        super(driver);
    }
}