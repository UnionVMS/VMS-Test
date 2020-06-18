package PageActions;

import PageObjects.*;
import PageObjects.PageComponents.LoginComponent;
import PageObjects.PageComponents.TopRightBar;
import PageObjects.PageInterfaces.INavigation;
import PageObjects.PageInterfaces.ITopRightBar;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public PageBase loginWith(LoginComponent login, String username, String password) {
        login.username.type(username);
        login.password.type(password);
        login.signIn.click();
        return new RealTimeMapPage(driver);
    }

    public PageBase logout(ITopRightBar currentPage) {
        currentPage.getTopRightBar().logout.click();
        return new LoginPage(driver);
    }
}
