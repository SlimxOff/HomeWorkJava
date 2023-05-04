package homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBaseContact {
    WebDriver wd;

    public HelperBaseContact(WebDriver wd) {
        this.wd=wd;
    }

    protected void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    protected void submit(By locator) {
        wd.findElement(locator).submit();
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }
}
