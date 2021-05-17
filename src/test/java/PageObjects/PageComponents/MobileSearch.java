package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileSearch extends ComponentBase {

    public MobileSearch(WebDriver driver) {
        super(driver);
    }
    public TextBox searchText = new TextBox(driver, By.cssSelector("#mat-input-4"), "Abel");
    public RadioButton showAllUnarchived = new RadioButton(driver, By.cssSelector("#mat-radio-2"));
    public RadioButton showActiveOnly = new RadioButton(driver, By.cssSelector("#mat-radio-3"));
    public RadioButton showArchived = new RadioButton(driver, By.cssSelector("#mat-radio-3"));
    public Text resultsFoundText = new Text(driver, By.cssSelector("#mat-input-4"));

    public Button exportToCSV = new Button(driver, By.cssSelector("button.mat-raised-button:nth-child(1)"));
    String[] headers = {"Ext. marking", "ICRS", "Name", "CFR", "F.S.", "mmsi"};
    public ResultList searchResultList = new ResultList(driver, By.cssSelector("button.mat-raised-button:nth-child(1)"), headers);

}