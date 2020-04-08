package PageObjects;

import PageObjects.PageComponents.AssetSearch;
import PageObjects.PageComponents.LoginComponent;
import PageObjects.PageComponents.NavigationBar;
import PageObjects.PageInterfaces.INavigation;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    public LoginComponent login = new LoginComponent(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}