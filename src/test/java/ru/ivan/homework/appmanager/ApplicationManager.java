package ru.ivan.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver wd;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
      wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void login(String username, String password) {
      wd.get("http://localhost/addressbook/index.php");
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void newGroupCreate() {
      wd.findElement(By.name("new")).click();
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys("test1");
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys("ivan");
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys("the best");
      wd.findElement(By.name("submit")).click();
    }

    public void goToGroupsPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }
}
