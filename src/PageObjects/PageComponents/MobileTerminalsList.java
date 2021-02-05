package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileTerminalsList extends ComponentBase {

    public MobileTerminalsList(WebDriver driver) {
        super(driver);
    }
    public List terminalList = new List(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"));
    public RadioButton exportToCsv = new RadioButton(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.toolbox-wrapper.ng-star-inserted > div > button"));
}