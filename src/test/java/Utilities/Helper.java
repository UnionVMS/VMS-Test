package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Helper {

    public static By getByFromElement(WebElement element) {

        By by = null;
//        String[] selectorWithValue= (element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":");

// TODO Loopa så att man får alla selektorer -> ... -> ...
        String elementString = element.toString();
        String[] selectorWithValue= (elementString.substring(elementString.lastIndexOf("->")+2).replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":");

        String selector = selectorWithValue[0].trim();
        String value = selectorWithValue[1].trim();

        switch (selector) {
            case "id":
                by = By.id(value);
                break;
            case "class name":
                by = By.className(value);
                break;
            case "tagName":
                by = By.tagName(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
            case "cssSelector":
                by = By.cssSelector(value);
                break;
            case "linkText":
                by = By.linkText(value);
                break;
            case "name":
                by = By.name(value);
                break;
            case "partialLinkText":
                by = By.partialLinkText(value);
                break;
            default:
                throw new IllegalStateException("locator : " + selector + " not found!!!");
        }
        return by;
    }
}
