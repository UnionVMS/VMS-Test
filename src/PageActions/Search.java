package PageActions;

import PageObjects.*;
import PageObjects.PageComponents.AssetSearch;
import PageObjects.PageInterfaces.INavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class Search {

    public Search() {

    }

    private void setCountries(AssetSearch assetSearchComponent, Map<String, Boolean> countriesEnabled) {
        countriesEnabled.forEach( (country,countryEnabled) -> {
            By countryRowLocator = By.cssSelector("#mat-option-" + country);
            assetSearchComponent.country.setValueInMultiDropdown(countryRowLocator, countryEnabled);
        });
    }

    private void submit(AssetSearch assetSearchComponent) {
        assetSearchComponent.search.click();
    }

    private void setSearchArgs(AssetSearch assetSearchComponent, Map<String, String> searchArgs) {
        searchArgs.forEach( (key,value) -> {
            switch(key.toLowerCase()) {
                case "externalmarkings": {
                    assetSearchComponent.externalMarking.type(value);
                    break;
                }
                case "name": {
                    assetSearchComponent.name.type(value);
                    break;
                }
                case "cfr": {
                    assetSearchComponent.cfr.type(value);
                    break;
                }
                case "ircs": {
                    assetSearchComponent.ircs.type(value);
                    break;
                }
                default:
            }
        });
    }

/*    public void searchAssets(AssetSearch assetSearchComponent,
                             Map<String, Boolean> countriesEnabled,
                             String externalMarkings,
                             String name,
                             String cfr,
                             String ircs) {
        setCountries(assetSearchComponent, countriesEnabled);
        setExternalMarkings(assetSearchComponent, externalMarkings);
        setName(assetSearchComponent, name);
        setCfr(assetSearchComponent, cfr);
        setIrcs(assetSearchComponent, ircs);
        submit(assetSearchComponent);
    }*/

    public void searchAssets(AssetSearch assetSearchComponent,
                             Map<String, Boolean> countriesEnabled,
                             Map<String, String> searchArgs) {
        setCountries(assetSearchComponent, countriesEnabled);
        setSearchArgs(assetSearchComponent, searchArgs);
    }
}

