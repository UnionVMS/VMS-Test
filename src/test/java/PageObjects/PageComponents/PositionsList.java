package PageObjects.PageComponents;

import PageObjects.PageElements.RadioButton;
import PageObjects.PageElements.ResultList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositionsList extends ComponentBase {

    public PositionsList(WebDriver driver) {
        super(driver);
    }
    private String[] headers = {"Timestamp", "Latitude", "Longitude", "Speed", "Heading", "Source satellite Id", "Ocean region", "Status code", "Source"};
    public ResultList lastPositions = new ResultList(driver, By.className("position-table"), headers);

}