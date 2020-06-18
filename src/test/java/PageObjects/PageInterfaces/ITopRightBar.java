package PageObjects.PageInterfaces;

import PageObjects.PageComponents.TopRightBar;

public interface ITopRightBar {
    TopRightBar topRightBar = null;

    default TopRightBar getTopRightBar() {
        return topRightBar;
    }
}
