package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LazyWebElement implements WebElement {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By by;
    private WebElement element;

    public LazyWebElement(WebDriver driver, By by, WebDriverWait wait) {
        this.driver = driver;
        this.by = by;
        this.wait = wait;
    }

    private WebElement getElement() {
        if (element == null) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            element = driver.findElement(by);
        }

        return element;
    }

    public void clear() {
        getElement().clear();
    }

    public String getTagName() {
        return getElement().getTagName();
    }

    public void click() {
        getElement().click();
    }

    public void submit() {
        getElement().submit();
    }

    public void sendKeys(CharSequence... keysToSend) {
        getElement().sendKeys(keysToSend);
    }

    public String getAttribute(String attributeName) {
        return getElement().getAttribute(attributeName);
    }

    public boolean isSelected() {
        return getElement().isSelected();
    }

    public boolean isEnabled() {
        return getElement().isEnabled();
    }

    public String getText() {
        return getElement().getText();
    }

    public List<WebElement> findElements(By by) {
        return getElement().findElements(by);
    }

    public WebElement findElement(By by) {
        return getElement().findElement(by);
    }

    public boolean isDisplayed() {
        return getElement().isDisplayed();
    }

    public Point getLocation() {
        return getElement().getLocation();
    }

    public Dimension getSize() {
        return getElement().getSize();
    }

    public Rectangle getRect() {
        return getElement().getRect();
    }

    public String getCssValue(String propertyName) {
        return getElement().getCssValue(propertyName);
    }

    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return getElement().getScreenshotAs(target);
    }
}
