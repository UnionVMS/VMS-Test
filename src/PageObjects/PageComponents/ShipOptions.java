package PageObjects.PageComponents;

import PageObjects.PageElements.RadioButton;
import PageObjects.PageElements.SelectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShipOptions extends ComponentBase {

    public RadioButton shipTypeOption = new RadioButton(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/mat-radio-group/mat-radio-button[1]"));
    public RadioButton flagStateOption = new RadioButton(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/mat-radio-group/mat-radio-button[2]"));
    public RadioButton sizeOption = new RadioButton(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/mat-radio-group/mat-radio-button[3]"));
    public SelectElement unitOfDistance = new SelectElement(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/mat-form-field/div/div[1]/div/mat-select"), "Metric");

    public ShipOptions(WebDriver driver) {
        super(driver);
    }
}


