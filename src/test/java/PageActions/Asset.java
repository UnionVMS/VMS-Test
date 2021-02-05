package PageActions;

import PageObjects.PageComponents.AssetSearch;
import org.openqa.selenium.By;

import java.util.Map;

public class Asset {

    public Asset() {

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

/*    private void setSearchArgs(AssetSearch assetSearchComponent, Map<String, String> searchArgs) {
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
    }*/

/*    private void setSearchText(AssetSearch assetSearchComponent, String searchText) {
        assetSearchComponent.searchText.type(searchText);
    }*/

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
                             String searchText,
                             String filterOption) {
        assetSearchComponent.searchText.type(searchText);
        switch(filterOption.toLowerCase()) {
            case "swe": {
                assetSearchComponent.swedishAssets.click();
                break;

            }
            case "vms": {
                assetSearchComponent.vmsAssets.click();
                break;

            }
            case "countries": {
                if (countriesEnabled.size() > 0)
                {
                    setCountries(assetSearchComponent, countriesEnabled);
                }
                break;
            }
            default:
        }

        submit(assetSearchComponent);
    }
}

