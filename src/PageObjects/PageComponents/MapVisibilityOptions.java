package PageObjects.PageComponents;

import PageObjects.PageElements.CheckBox;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapVisibilityOptions extends ComponentBase {

/*
    public CheckBox showFlags = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-1-input"));
    public CheckBox showTracks = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-2-input"));
    public CheckBox showNames = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-3-input"));
    public CheckBox showSpeeds = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-4-input"));
    public CheckBox showForecasts = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-5-input"));
*/
    public CheckBox showFlags = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-1"));
    public CheckBox showTracks = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-2"));
    public CheckBox showNames = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-3"));
    public CheckBox showSpeeds = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-4"));
    public CheckBox showForecasts = new CheckBox(driver, By.cssSelector("#mat-slide-toggle-5"));

    public MapVisibilityOptions(WebDriver driver) {
        super(driver);
    }
}