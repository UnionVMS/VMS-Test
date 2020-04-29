package PageObjects.PageComponents;

import PageObjects.PageElements.CheckBox;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapVisibilityOptions extends ComponentBase {

//    public CheckBox showFlags = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-1"), false);
    public CheckBox showFlags = new CheckBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/div/mat-slide-toggle[1]"), false);
    public CheckBox showTracks = new CheckBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/div/mat-slide-toggle[2]"), false);
    public CheckBox showNames = new CheckBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/div/mat-slide-toggle[3]"), false);
    public CheckBox showSpeeds = new CheckBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/div/mat-slide-toggle[4]"), false);
    public CheckBox showForecasts = new CheckBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/div/mat-slide-toggle[5]"), false);

    public MapVisibilityOptions(WebDriver driver) {
        super(driver);
    }
}

