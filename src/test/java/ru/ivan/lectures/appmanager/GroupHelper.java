package ru.ivan.lectures.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void newGroupCreate(String groupName, String groupHeader, String groupFooter) {
        typeInfo(By.name("group_name"), groupName);
        typeInfo(By.name("group_header"), groupHeader);
        typeInfo(By.name("group_footer"), groupFooter);
    }

    public void deleteSelectedGroups() {
     click(By.name("delete"));
    }
    public void submitButton(){
        click(By.name("submit"));
    }
    public void newGroupButton(){
        click(By.name("new"));
    }

    public void selectGroup() {
      click(By.name("selected[]"));
    }
    public void submitGroupModification(){
        click(By.name("update"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }
}
