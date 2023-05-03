package ru.ivan.lectures.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd=wd;
    }

    public void goToGroupsPage() {
      wd.findElement(By.linkText("groups")).click();
    }
}
