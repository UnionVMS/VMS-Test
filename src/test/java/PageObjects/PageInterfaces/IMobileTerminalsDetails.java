package PageObjects.PageInterfaces;

import PageObjects.PageComponents.MobileTerminalsDetailsNavigation;

public interface IMobileTerminalsDetails {
    MobileTerminalsDetailsNavigation mobileTerminalsDetailsNavigation = null;

    default MobileTerminalsDetailsNavigation getMobileTerminalsDetailsNavigation() {
        return mobileTerminalsDetailsNavigation;
    }
}
