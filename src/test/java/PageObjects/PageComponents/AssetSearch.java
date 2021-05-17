package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetSearch extends ComponentBase {

    public AssetSearch(WebDriver driver) {
        super(driver);
    }
    public TextBox searchText = new TextBox(driver, By.cssSelector("#mat-input-4"), "Abel");
    public RadioButton swedishAssets = new RadioButton(driver, By.cssSelector("#mat-radio-2"));
    public RadioButton vmsAssets = new RadioButton(driver, By.cssSelector("#mat-radio-3"));
    public RadioButton flagState = new RadioButton(driver, By.cssSelector("#mat-radio-4"));

    public SelectElement countrySelector = new SelectElement(driver, By.cssSelector("#mat-select-2"), "SWE");
    public Button search = new Button(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-search-page > div > form > div > button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-primary"));
    public Button clear = new Button(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > asset-search-page > div > form > div > button.mat-focus-indicator.mat-button.mat-button-base.mat-primary"));
}