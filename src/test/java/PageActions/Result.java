package PageActions;

import PageObjects.PageElements.ResultList;
import PageObjects.PageElements.ResultListHeader;
import PageObjects.PageElements.ResultListRow;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Result {
    WebDriver driver;

    public Result(WebDriver driver) {
        this.driver = driver;
    }

    public String getCellValue(ResultList currentResult, int rowNumber, String column) {
        int columnIndex = getIndexOf(currentResult.getHeaders(), column);
        return currentResult.getCellValue(columnIndex, rowNumber);
    }

    private int getIndexOf(ArrayList<ResultListHeader> headers, String columnName) {
        int columnIndex = 0;
        for (ResultListHeader head: headers) {
            if (head.getName().equals(columnName)) {
                return columnIndex;
            }
            columnIndex++;
        }
        return -1;
    }
}

