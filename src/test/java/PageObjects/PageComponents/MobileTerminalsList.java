package PageObjects.PageComponents;

import PageObjects.PageElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileTerminalsList extends ComponentBase {

    public MobileTerminalsList(WebDriver driver) {
        super(driver);
    }
    String[] headers = {"Ext. marking", "ICRS", "Name", "CFR", "F.S.", "mmsi"};
    public ResultList terminalResultList = new ResultList(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > mobile-terminal-list-page > div > div > div > table"), headers);
    public RadioButton exportToCsv = new RadioButton(driver, By.cssSelector("body > app-root > core-asset-layout-component > div > div.toolbox-wrapper.ng-star-inserted > div > button"));
}