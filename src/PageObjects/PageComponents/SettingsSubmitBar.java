package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsSubmitBar extends ComponentBase {

    public Button saveSettings = new Button(driver, By.cssSelector(".mat-raised-button"));
    public Button returnToDefault = new Button(driver, By.cssSelector(".mat-stroked-button"));

    public SettingsSubmitBar(WebDriver driver) {
        super(driver);
    }
}