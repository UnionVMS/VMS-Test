package PageObjects.PageElements;

import PageObjects.PageElements.ResultListHeader;
import PageObjects.PageElements.ResultListRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultList {
    private By elementLocator;
    private WebDriver driver;
    private ArrayList<ResultListHeader> columns = new ArrayList<>();
    private ArrayList<ResultListRow> rows = new ArrayList<>();
    private String addRows = "/html/body/app-root/core-asset-layout-component/div/asset-search-page/div/div/div[2]/div/table/tbody/tr";
    private String allRows = "/html/body/app-root/core-asset-layout-component/div/asset-search-page/div/div/div[2]/div/table/tbody/tr/td[1]";

    public ResultList(WebDriver driver, By elementLocator, String[] columns) {
        this.elementLocator = elementLocator;
        this.driver = driver;
        for (String strTemp : columns){
            this.columns.add(new ResultListHeader(driver, By.linkText(strTemp), strTemp));
        }
//        List col = driver.findElements(By.xpath("/html/body/app-root/core-asset-layout-component/div/asset-search-page/div/div/div[2]/div/table/thead/tr/th"));
        // getAllRows();
    }
    private void getAllRows() {
        List allRowsList = driver.findElements(By.xpath(allRows));
        int numberOfRows = 0;
        try {
            numberOfRows = allRowsList.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0; i < numberOfRows; i++) {
            this.rows.add(new ResultListRow(driver, By.xpath(addRows + "[" + (i+1) + "]")));
        }
    }
        public void refresh() {
            getAllRows();
    }
    public String getCellValue(int columnNumber, int rowNumber) {
//        ResultListCell currentCell = new ResultListCell(driver, By.xpath(addRows + "[" + rowNumber + "]/td[" + columnNumber + "]"));
        ResultListCell currentCell = new ResultListCell(driver, By.xpath(addRows + "[" + (rowNumber+1) + "]/td[" + (columnNumber+1) + "]"));
        return currentCell.getText();
    }


    public void clickSorting(String headerName) {
        driver.findElement(elementLocator).click();
    }

    public ResultListRow getRow(int rowNumber) {
        return rows.get(rowNumber);
    }

    public ArrayList getHeaders() {
        return columns;
    }
}