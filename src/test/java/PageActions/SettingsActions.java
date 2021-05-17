package PageActions;

import PageObjects.PageComponents.*;
import PageObjects.SettingsPage;
import Utilities.Constants;
import Utilities.Constants.ShipColourLogic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static Utilities.Constants.ShipColourLogic.*;

public class SettingsActions {

    public SettingsActions() {
    }

    public void submit(SettingsSubmitBar settingsSubmitBar) {
        settingsSubmitBar.saveSettings.click();
    }

    public void resetToDefault(SettingsSubmitBar settingsSubmitBar) {
        settingsSubmitBar.returnToDefault.click();
    }


    public void setVisibility(MapVisibilityOptions mapVisibilityOptions, Map<Constants.MapVisibilityOptionsEnum, Boolean> visibilityArgs) {
        visibilityArgs.forEach( (key,value) -> {
            switch(key) {
                case SHOWFLAGS: {
                    mapVisibilityOptions.showFlags.setStatus(value);
                    break;
                }
                case SHOWTRACKS: {
                    mapVisibilityOptions.showTracks.setStatus(value);
                    break;
                }
                case SHOWNAMES: {
                    mapVisibilityOptions.showNames.setStatus(value);
                    break;
                }
                case SHOWSPEEDS: {
                    mapVisibilityOptions.showSpeeds.setStatus(value);
                    break;
                }
                case SHOWFORECASTS: {
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

    public boolean getMapVisibilityState(MapVisibilityOptions mapVisibilityOptions, Constants.MapVisibilityOptionsEnum checkbox) {
            switch(checkbox) {
                case SHOWFLAGS: {
                    return mapVisibilityOptions.showFlags.isEnabled();
                }
                case SHOWTRACKS: {
                    return mapVisibilityOptions.showTracks.isEnabled();
                }
                case SHOWNAMES: {
                    return mapVisibilityOptions.showNames.isEnabled();
                }
                case SHOWSPEEDS: {
                    return mapVisibilityOptions.showSpeeds.isEnabled();
                }
                case SHOWFORECASTS: {
                    return mapVisibilityOptions.showForecasts.isEnabled();
                }
                default: {
                    System.out.println("Missing option in argument");
                    return false;
                }
            }
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

    public void setZoomLevel(MapStartPositionOptions mapStartPositionOptions,
                             String zoomLevel) {
        mapStartPositionOptions.zoomLevel.type(zoomLevel);
    }

    public String getZoomLevel(MapStartPositionOptions mapStartPositionOptions) {
        return mapStartPositionOptions.zoomLevel.getValue();
    }

    public void setLatitude(MapStartPositionOptions mapStartPositionOptions,
                            String latitude) {
        mapStartPositionOptions.startLatitude.type(latitude);
    }

    public String getLatitude(MapStartPositionOptions mapStartPositionOptions) {
        return mapStartPositionOptions.startLatitude.getValue();
    }

    public void setLongitude(MapStartPositionOptions mapStartPositionOptions,
                             String longitude) {
        mapStartPositionOptions.startLongitude.type(longitude);
    }

    public String getLongitude(MapStartPositionOptions mapStartPositionOptions) {
        return mapStartPositionOptions.startLongitude.getValue();
    }

    public void setTrackLength(TracksAndForecastsOptions tracksAndForecastsOptions,
                             String trackLength) {
        tracksAndForecastsOptions.trackLength.setValueInDropdown(trackLength);
    }

    public String getTrackLength(TracksAndForecastsOptions tracksAndForecastsOptions) {
        return tracksAndForecastsOptions.trackLength.getValue();
    }

    public void setForecastInterval(TracksAndForecastsOptions tracksAndForecastsOptions,
                             String forecastInterval) {
        tracksAndForecastsOptions.forecastInterval.type(forecastInterval);
    }

    public String getForecastInterval(TracksAndForecastsOptions tracksAndForecastsOptions) {
        return tracksAndForecastsOptions.forecastInterval.getValue();
    }

    public void setTracksAndForecast(TracksAndForecastsOptions tracksAndForecastsOptions,
                                     String trackLength,
                                     String forecastInterval) {
        tracksAndForecastsOptions.trackLength.setValueInDropdown(trackLength);
        tracksAndForecastsOptions.forecastInterval.type(forecastInterval);
    }

    public void setShipOptions(ShipOptions shipOptions, ShipColourLogic shipColourLogic, String unitOfDistance) {
        switch(shipColourLogic) {
            case SHIPTYPE: {
                shipOptions.shipTypeOption.click();
                break;
            }
            case SHIPTYPESGROUPED: {
                shipOptions.shipTypesGroupedOption.click();
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

    public void setShipColourLogic(ShipOptions shipOptions, ShipColourLogic shipColourLogic) {
        switch(shipColourLogic) {
            case SHIPTYPE: {
                shipOptions.shipTypeOption.click();
                break;
            }
            case SHIPTYPESGROUPED: {
                shipOptions.shipTypesGroupedOption.click();
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
    }

    public ShipColourLogic getSelectedShipColourLogic(ShipOptions shipOptions) {
        if (shipOptions.shipTypeOption.isSelected()) {
            return SHIPTYPE;
        } else if (shipOptions.shipTypesGroupedOption.isSelected()) {
            return SHIPTYPESGROUPED;
        } else if (shipOptions.flagStateOption.isSelected()) {
            return FLAGSTATE;
        } else if (shipOptions.sizeOption.isSelected()) {
            return SIZE;
        }
        else {
            return null;
        }
    }

    public void setUnitOfDistance(ShipOptions shipOptions,
                               String unitOfDistance) {
        shipOptions.unitOfDistance.setValueInDropdown(unitOfDistance);
    }

    public String getUnitOfDistance(ShipOptions shipOptions) {
        return shipOptions.unitOfDistance.getValue();
    }


    public void resetMapVisibilityOptions(MapVisibilityOptions mapVisibilityOptions) {
        mapVisibilityOptions.showFlags.resetToDefault();
        mapVisibilityOptions.showTracks.resetToDefault();
        mapVisibilityOptions.showNames.resetToDefault();
        mapVisibilityOptions.showSpeeds.resetToDefault();
        mapVisibilityOptions.showForecasts.resetToDefault();
    }
    public void resetMapStartPositionOptions(MapStartPositionOptions mapStartPositionOptions) {
        mapStartPositionOptions.zoomLevel.resetToDefault();
        mapStartPositionOptions.startLatitude.resetToDefault();
        mapStartPositionOptions.startLongitude.resetToDefault();
    }
    public void resetTracksAndForecastsOptions(TracksAndForecastsOptions tracksAndForecastsOptions) {
        tracksAndForecastsOptions.trackLength.resetToDefault();
        tracksAndForecastsOptions.forecastInterval.resetToDefault();
    }
    public void resetShipOptions(ShipOptions shipOptions) {
        shipOptions.shipTypeOption.click();
        shipOptions.unitOfDistance.resetToDefault();
    }


}

