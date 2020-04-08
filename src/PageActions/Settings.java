package PageActions;

import PageObjects.PageComponents.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Settings {

    public Settings() {
    }

    public void submit(SettingsSubmitBar settingsSubmitBar) {
        settingsSubmitBar.saveSettings.click();
    }

    public void resetToDefault(SettingsSubmitBar settingsSubmitBar) {
        settingsSubmitBar.returnToDefault.click();
    }

    // todo  gör som ShipOptions
    public void setVisibility(MapVisibilityOptions mapVisibilityOptions, Map<String, Boolean> visibilityArgs) {
        visibilityArgs.forEach( (key,value) -> {
            switch(key.toLowerCase()) {
                case "showflags": {
                    mapVisibilityOptions.showFlags.setStatus(value);
                    break;
                }
                case "showtracks": {
                    mapVisibilityOptions.showTracks.setStatus(value);
                    break;
                }
                case "shownames": {
                    mapVisibilityOptions.showNames.setStatus(value);
                    break;
                }
                case "showspeeds": {
                    mapVisibilityOptions.showSpeeds.setStatus(value);
                    break;
                }
                case "showforecasts": {
                    mapVisibilityOptions.showForecasts.setStatus(value);
                    break;
                }
                default: {
                    System.out.println("Missing option in argument");
                    break;
                }
            }
        });
    }


    // todo göra till valbara parametrar
    public void setMapStartPosition(MapStartPositionOptions mapStartPositionOptions,
                                    String zoomLevel,
                                    String startLatitude,
                                    String startLongitude) {
        mapStartPositionOptions.zoomLevel.type(zoomLevel);
        mapStartPositionOptions.startLatitude.type(startLatitude);
        mapStartPositionOptions.startLongitude.type(startLongitude);
    }

    public void setTracksAndForecast(TracksAndForecastsOptions tracksAndForecastsOptions,
                                     String trackLength,
                                     String forecastInterval) {
        tracksAndForecastsOptions.trackLength.setValueInDropdown(trackLength);
        tracksAndForecastsOptions.forecastInterval.type(forecastInterval);
    }


    public void setShipOptions(ShipOptions shipOptions,
                               ShipOptions.ShipColourLogic shipColourLogic,
                                     String unitOfDistance) {
        switch(shipColourLogic) {
            case SHIPTYPE: {
                shipOptions.shipTypeOption.click();
                break;
            }
            case FLAGSTATE: {
                shipOptions.flagStateOption.click();
                break;
            }
            case SIZE: {
                shipOptions.sizeOption.click();
                break;
            }
            default: {
                System.out.println("Missing option in argument");
                break;
            }
        }
        shipOptions.unitOfDistance.setValueInDropdown(unitOfDistance);
    }

}

