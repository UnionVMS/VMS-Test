package PageObjects.PageComponents;

import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TracksAndForecastsOptions extends ComponentBase {

    public SelectElement trackLength = new SelectElement(driver, By.cssSelector("#mat-select-1"));
    public TextBox forecastInterval = new TextBox(driver, By.cssSelector("#mat-input-11"));

    public TracksAndForecastsOptions(WebDriver driver) {
        super(driver);
    }
}


