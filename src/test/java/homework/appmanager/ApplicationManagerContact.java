package homework.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManagerContact {
    public boolean acceptNextAlert = true;
    WebDriver wd;

    private SessionHelperContact sessionHelperContact;
    private ContactHelper contactHelper;

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }
    public String closeAlertAndGetItsText() {
        try {
            Alert alert = wd.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/index.php");
        contactHelper = new ContactHelper(wd);
        sessionHelperContact = new SessionHelperContact(wd);
        sessionHelperContact.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactCreateHelper() {
        return contactHelper;
    }

    public SessionHelperContact getSessionHelperContact() {
        return sessionHelperContact;
    }
}
