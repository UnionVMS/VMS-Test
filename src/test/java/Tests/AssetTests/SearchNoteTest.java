package Tests.AssetTests;

import PageActions.AssetActions;
import PageActions.NavigateAssets;
import PageActions.Result;
import PageObjects.AssetsNotesPage;
import PageObjects.AssetsSearchPage;
import PageObjects.PageElements.NotesListRow;
import Utilities.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SearchNoteTest extends AssetTest {

    public SearchNoteTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "hfg", "sd"})
    public void searchForNoteAndVerifyFound(String searchText) {
        AssetActions assetsActions = new AssetActions();
        Result result = new Result(driver);
        AssetsSearchPage assetsSearchPage = (AssetsSearchPage) testPage;

        assetsActions.search(assetsSearchPage.assetSearch, Constants.AssetSearchOptions.SWEDISHASSETS, "SWET", assetsSearchPage.searchResultList);
        assetsSearchPage.searchResultList.clickRow(0);

        NavigateAssets navigate = new NavigateAssets(driver);
        AssetsNotesPage assetsNotesPage = (AssetsNotesPage) navigate.navigateTo(assetsSearchPage, Constants.AssetsMenuItem.NOTES);
        assetsNotesPage.createNote.noteText.type("My little note");
        assetsNotesPage.createNote.addNote.click();
        assetsNotesPage.allNotes.searchText.type("sd");

       // assertThat(result.getCellValue(assetsSearchPage.searchResultList, 0, "CFR"), is(equalTo(searchText)));

        assetsNotesPage.allNotes.allNotesList.refresh();
        NotesListRow currentNote = ((AssetsNotesPage) testPage).allNotes.allNotesList.getRow(1);
        currentNote.getMessage();
        currentNote.clickMenuLink();
        currentNote.clickEditNote();
        currentNote.editNote(currentNote.getMessage() + "554545454");
        currentNote.confirm();
        currentNote.clickMenuLink();
        currentNote.clickDeleteNote();
        currentNote.cancel();
        currentNote.clickMenuLink();
        currentNote.clickDeleteNote();
        currentNote.confirm();
    }
}

