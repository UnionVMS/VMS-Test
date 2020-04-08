package PageObjects.PageComponents;

import PageObjects.PageElements.CheckBox;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapStartPositionOptions extends ComponentBase {

    public TextBox zoomLevel = new TextBox(driver, By.cssSelector("#mat-input-8"));
    public TextBox startLatitude = new TextBox(driver, By.cssSelector("#mat-input-9"));
    public TextBox startLongitude = new TextBox(driver, By.cssSelector("#mat-input-10"));

    public MapStartPositionOptions(WebDriver driver) {
        super(driver);
    }
}