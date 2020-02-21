package PageObjects;

import org.openqa.selenium.WebDriver;

public abstract class PageBase {
    protected final WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public String GetTitle() {
        return driver.getTitle();
    }

}
