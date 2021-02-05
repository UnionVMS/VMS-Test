package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.EditList;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotesList extends ComponentBase {

    public EditList notesList = new EditList(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"));

    public NotesList(WebDriver driver) {
        super(driver);
    }
}