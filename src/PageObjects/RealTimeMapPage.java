package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealTimeMapPage extends PageBase {

    public RealTimeMapPage(WebDriver driver) {
        super(driver);

        // Check that we're on the right page.
/*        if (!"".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }*/
    }

    // The login page contains several HTML elements that will be represented as WebElements.
    // The locators for these elements should only be defined once.
    By menuItemAssetsLocator = By.linkText("Assets");

    // The login page allows the user to submit the login form
    public AssetsPage clickMenuItemAssets() {
        // This is the only place that submits the login form and expects the destination to be the home page.
        // A separate method should be created for the instance of clicking login whilst expecting a login failure.
        driver.findElement(menuItemAssetsLocator).click();

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return new AssetsPage(driver);
    }

}