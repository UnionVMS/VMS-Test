package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.SelectElement;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNote extends ComponentBase {

    public TextBox noteText = new TextBox(driver, By.cssSelector("textarea[formcontrolname='note'"), "New note");
    public Button addNote = new Button(driver, By.id("notes-form--save"));

    public CreateNote(WebDriver driver) {
        super(driver);
    }
}