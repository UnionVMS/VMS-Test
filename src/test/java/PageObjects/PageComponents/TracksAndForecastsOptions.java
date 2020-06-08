package PageObjects.PageComponents;

import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TracksAndForecastsOptions extends ComponentBase {

    public SelectElement trackLength = new SelectElement(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[2]/div/mat-form-field[1]/div/div[1]/div/mat-select"), "1 hour");
    public TextBox forecastInterval = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[2]/div/mat-form-field[2]/div/div[1]/div/input"), "1");

    public TracksAndForecastsOptions(WebDriver driver) {
        super(driver);
    }
}


