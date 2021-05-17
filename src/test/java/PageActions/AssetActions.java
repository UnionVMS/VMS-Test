package PageActions;

import PageObjects.PageComponents.*;
import PageObjects.PageElements.ResultList;
import Utilities.Constants;
import org.openqa.selenium.By;

import java.util.Map;

import static Utilities.Constants.AssetSearchOptions.*;

public class AssetActions {

    public AssetActions() {

    }

    private void setCountries(AssetSearch assetSearchComponent, Map<String, Boolean> countriesEnabled) {
        countriesEnabled.forEach( (country,countryEnabled) -> {
            By countryRowLocator = By.cssSelector("#mat-option-" + country);
            assetSearchComponent.countrySelector.setValueInMultiDropdown(countryRowLocator, countryEnabled);
        });
    }

    private void submit(AssetSearch assetSearchComponent) {
        assetSearchComponent.search.click();
    }

    private void clear(AssetSearch assetSearchComponent) {
        assetSearchComponent.clear.click();
    }


    public void search(AssetSearch assetSearch, Constants.AssetSearchOptions selectedOption, String searchText, ResultList targetResultList) {
        setSearchOptions(assetSearch, selectedOption);
        assetSearch.searchText.type(searchText);
        submit(assetSearch);
        targetResultList.refresh();
    }
    public void setSearchOptions(AssetSearch assetSearch, Constants.AssetSearchOptions selectedOption) {
        switch(selectedOption) {
            case SWEDISHASSETS: {
                assetSearch.swedishAssets.click();
                break;
            }
            case VMSASSETS: {
                assetSearch.vmsAssets.click();
                break;
            }
            case FLAGSTATE: {
                assetSearch.flagState.click();
                break;
            }
            default: {
                System.out.println("Missing option in argument");
                break;
            }
        }
    }
    public Constants.AssetSearchOptions getSearchOption(AssetSearch assetSearch) {
        if (assetSearch.swedishAssets.isSelected()) {
            return SWEDISHASSETS;
        } else if (assetSearch.vmsAssets.isSelected()) {
            return VMSASSETS;
        } else if (assetSearch.flagState.isSelected()) {
            return FLAGSTATE;
        }
        else {
            return null;
        }
    }
}

