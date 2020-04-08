package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetSearch extends ComponentBase {

    public AssetSearch(WebDriver driver) {
        super(driver);
    }
    public SelectElement country = new SelectElement(driver, By.cssSelector("mat-form-field"));
    public TextBox externalMarking = new TextBox(driver, By.cssSelector("#mat-input-4"));
    public TextBox name = new TextBox(driver, By.cssSelector("#mat-input-5"));
    public TextBox cfr = new TextBox(driver, By.cssSelector("#mat-input-6"));
    public TextBox ircs = new TextBox(driver, By.cssSelector("#mat-input-7"));
    public Button search = new Button(driver, By.cssSelector("button.mat-raised-button:nth-child(1)"));

}