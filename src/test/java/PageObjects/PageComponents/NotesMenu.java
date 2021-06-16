package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.RouterLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotesMenu extends ComponentBase {

    public Button editNote = new Button(driver, By.cssSelector(".mat-menu-panel > div > button:nth-child(1)"));
    public Button deleteNote = new Button(driver, By.cssSelector(".mat-menu-panel > div > button:nth-child(2)"));
    public Button addFile = new Button(driver, By.cssSelector(".mat-menu-panel > div > button:nth-child(3)"));
    public Button printNote = new Button(driver, By.cssSelector(".mat-menu-panel > div > button:nth-child(4)"));

    public NotesMenu(WebDriver driver) {
        super(driver);
    }
}