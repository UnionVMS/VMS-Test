package PageObjects.PageElements;

import Utilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NotesList {
    private By elementLocator;
    private WebDriver driver;
    private ArrayList<NotesListRow> rows = new ArrayList<>();
    private String addRows = "/html/body/app-root/core-asset-layout-component/div/asset-search-page/div/div/div[2]/div/table/tbody/tr";
    private String allRows = "body > app-root > core-asset-layout-component > div > notes-list-page > div > notes-list > div.notes";
    //public EditList notesList = new EditList(driver, By.xpath("/html/body/app-root/core-default-layout-component/div/settings-user-settings/form/fieldset[1]/fieldset[1]/mat-form-field/div/div[1]/div/input"));

    public NotesList(WebDriver driver, By elementLocator) {
        this.elementLocator = elementLocator;
        this.driver = driver;
//        for (String strTemp : columns){
//            this.columns.add(new ResultListHeader(driver, By.linkText(strTemp), strTemp));
//        }
//        List col = driver.findElements(By.xpath("/html/body/app-root/core-asset-layout-component/div/asset-search-page/div/div/div[2]/div/table/thead/tr/th"));
        // getAllRows();
    }
    private void getAllRows() {
        // Create an interface WebElement of the div under div with **class as facetContainerDiv**
        //IWebElement WebElement =    driver.FindElement(By.XPath("//div[@class='facetContainerDiv']/div"));
        // Create an IList and intialize it with all the elements of div under div with **class as facetContainerDiv**
        //IList<IWebElement> AllCheckBoxes = WebElement.FindElements(By.XPath("//label/input"));

        WebElement notesRoot = driver.findElement(By.className("notes"));
        List<WebElement> allNotes = notesRoot.findElements(By.className("note"));

//        List allRowsList = driver.findElements(By.xpath(allRows));
        int numberOfRows = 0;
        try {
            numberOfRows = allNotes.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0; i < numberOfRows; i++) {
            this.rows.add(new NotesListRow(driver, Helper.getByFromElement(allNotes.get(i))));
        }
    }
        public void refresh() {
            getAllRows();
    }



    public NotesListRow getRow(int rowNumber) {
        return rows.get(rowNumber);
    }
}