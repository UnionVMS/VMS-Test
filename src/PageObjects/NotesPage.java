package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.WebDriver;

public class NotesPage extends PageBase implements INavigation, ITopLeftBar, ITopRightBar {

    public NavigationBar navigationBar = new NavigationBar(driver);
    public TopLeftBar topLeftBar = new TopLeftBar(driver);
    public TopRightBar topRightBar = new TopRightBar(driver);

    public CreateNote createNote = new CreateNote(driver);
    public SearchNote searchNote = new SearchNote(driver);
    public NotesList notesList = new NotesList(driver);
    public AssetCompanyInformation assetCompanyInformation = new AssetCompanyInformation(driver);

    public NotesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    @Override
    public TopLeftBar getTopLeftBar() {
        return topLeftBar;
    }

    @Override
    public TopRightBar getTopRightBar() {
        return topRightBar;
    }


}