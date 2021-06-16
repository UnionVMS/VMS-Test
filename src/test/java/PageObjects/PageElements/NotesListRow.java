package PageObjects.PageElements;

import PageObjects.PageComponents.NotesMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

public class NotesListRow {
    private By elementLocator;
    private WebDriver driver;
    private String user;
    private String timeStamp;
    private String timeZone;
    private String message;
    private NotesMenu notesMenu;
    private Button confirmButton;
    private Button cancelButton;
    private TextBox editText;

    public NotesListRow(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        this.user = driver.findElement(elementLocator).findElement(By.className("user")).getText();
        this.timeStamp = driver.findElement(elementLocator).findElement(By.className("date")).getText();
        this.timeZone = driver.findElement(elementLocator).findElement(By.className("date")).findElement(By.className("timezone")).getText();
        this.message = driver.findElement(elementLocator).findElement(By.className("note-text")).getText();
    }

    public String getUser() {
        return user;
    }
    public String getTimeStamp() {
        return timeStamp;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getMessage() {
        return message;
    }

    public void clickMenuLink() {
        driver.findElement(elementLocator).findElement(By.className("edit-link")).click();
        notesMenu = new NotesMenu(driver);
    }

    public void clickEditNote(){
        getNotesMenu().editNote.click();
        confirmButton = new Button(driver, new ByChained(elementLocator, By.id("notes-form--save")));
        cancelButton = new Button(driver, new ByChained(elementLocator, By.id("notes-form--cancel")));
        editText = new TextBox(driver, new ByChained(elementLocator, By.tagName("textarea")), message);
    }
    public void clickDeleteNote() {
        getNotesMenu().deleteNote.click();
        confirmButton = new Button(driver, By.cssSelector(".mat-dialog-actions > button:nth-child(2)"));
        cancelButton = new Button(driver, By.cssSelector(".mat-dialog-actions > button:nth-child(1)"));
    }

    public NotesMenu getNotesMenu() {
        return notesMenu;
    }

    public void editNote(String newText) {
        editText.type(newText);
    }
    public void confirm() {
        confirmButton.click();
    }
    public void cancel() {
        cancelButton.click();
    }
    public TextBox getEditText() {
        return editText;
    }
}