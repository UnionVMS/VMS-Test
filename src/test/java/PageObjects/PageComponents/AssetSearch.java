package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.RadioButton;
import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetSearch extends ComponentBase {

    public AssetSearch(WebDriver driver) {
        super(driver);
    }
    public TextBox searchText = new TextBox(driver, By.cssSelector("#mat-input-4"), "tallona");
    public RadioButton swedishAssets = new RadioButton(driver, By.cssSelector("#mat-radio-2"));
    public RadioButton vmsAssets = new RadioButton(driver, By.cssSelector("#mat-radio-3"));
    public RadioButton country = new RadioButton(driver, By.cssSelector("#mat-radio-4"));
    public SelectElement countrySelector = new SelectElement(driver, By.cssSelector("#mat-select-1"), "SWE");
    public Button search = new Button(driver, By.cssSelector("button.mat-raised-button:nth-child(1)"));

}