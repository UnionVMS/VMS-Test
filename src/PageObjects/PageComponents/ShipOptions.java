package PageObjects.PageComponents;

import PageObjects.PageElements.RadioButton;
import PageObjects.PageElements.SelectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShipOptions extends ComponentBase {

    public enum ShipColourLogic { SHIPTYPE, FLAGSTATE, SIZE }
    public RadioButton shipTypeOption = new RadioButton(driver, By.cssSelector("#mat-radio-2"));
    public RadioButton flagStateOption = new RadioButton(driver, By.cssSelector("#mat-radio-3"));
    public RadioButton sizeOption = new RadioButton(driver, By.cssSelector("#mat-radio-4"));
    public SelectElement unitOfDistance = new SelectElement(driver, By.cssSelector("#mat-select-2"));

    public ShipOptions(WebDriver driver) {
        super(driver);
    }
}


