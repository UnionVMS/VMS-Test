package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchNote extends ComponentBase {

    public TextBox searchBox = new TextBox(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"), "1");

    public SearchNote(WebDriver driver) {
        super(driver);
    }
}