package PageObjects.PageComponents;

import PageObjects.PageElements.Button;
import PageObjects.PageElements.RouterLink;
import PageObjects.PageElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginComponent extends ComponentBase {

    public TextBox username = new TextBox(driver, By.cssSelector("#loginFormUsername"));
    public TextBox password = new TextBox(driver, By.cssSelector("#loginFormPassword"));
    public Button signIn = new Button(driver, By.cssSelector(".btn"));
    public RouterLink forgotPassword = new RouterLink(driver, By.cssSelector(".content-container > form:nth-child(1) > div:nth-child(4) > a:nth-child(1)"));

    public LoginComponent(WebDriver driver) {
        super(driver);
    }
}