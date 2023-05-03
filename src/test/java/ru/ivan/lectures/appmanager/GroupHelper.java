package ru.ivan.lectures.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    WebDriver wd;

    public GroupHelper(WebDriver wd) {
        this.wd=wd;
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

    public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }
}
