package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllNotes extends ComponentBase {

    public AllNotes(WebDriver driver) {
        super(driver);
    }
    public TextBox notesHeader = new TextBox(driver, By.className("all-notes"), "Abel");
    public TextBox searchText = new TextBox(driver, By.cssSelector("#mat-input-6"), "Abel");
//    public TextBox searchText = new TextBox(driver, By.className("search-wrapper"), "Abel");
    public NotesList allNotesList = new NotesList(driver, By.className("notes"));
}