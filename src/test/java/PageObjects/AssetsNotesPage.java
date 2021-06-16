package PageObjects;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.Button;
import PageObjects.PageElements.TextBox;
import PageObjects.PageInterfaces.IAssetsDetails;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopLeftBar;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsNotesPage extends AssetsPage implements INavigation, ITopLeftBar, ITopRightBar, IAssetsDetails {

    public CreateNote createNote = new CreateNote(driver);
    public AllNotes allNotes = new AllNotes(driver);

    public AssetsNotesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AssetDetailsNavigation getAssetDetailsNavigation() {
        return super.assetDetailsNavigation;
    }

    @Override
    public NavigationBar getNavigationBar() {
        return super.navigationBar;
    }

    @Override
    public TopLeftBar getTopLeftBar() {
        return super.topLeftBar;
    }

    @Override
    public TopRightBar getTopRightBar() {
        return super.topRightBar;
    }



}