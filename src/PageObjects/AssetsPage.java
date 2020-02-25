package PageObjects;

import DataModels.AssetData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetsPage extends PageBase {

    public AssetsPage(WebDriver driver) {
        super(driver);

        // Check that we're on the right page.
/*        if (!"".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }*/
    }

    // The locators for these elements should only be defined once.
    By menuItemAssetsLocator = By.linkText("Assets");

    public AssetsPage createNewAsset(AssetData assetData) {


        // ToDo: Enter data into corresponding elements

        //driver.findElement(menuItemAssetsLocator).click();

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return this;
    }

}