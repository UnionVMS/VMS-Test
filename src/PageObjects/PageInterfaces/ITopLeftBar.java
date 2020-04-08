package PageObjects.PageInterfaces;

import PageObjects.PageComponents.TopLeftBar;

public interface ITopLeftBar {
    TopLeftBar topLeftBar = null;

    default TopLeftBar getTopLeftBar() {
        return topLeftBar;
    }
}
