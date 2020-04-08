package PageObjects.PageInterfaces;

import PageObjects.PageComponents.NavigationBar;

public interface INavigation {
    NavigationBar navigationBar = null;

    default NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
