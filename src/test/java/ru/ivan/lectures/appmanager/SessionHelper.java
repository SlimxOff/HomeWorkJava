package ru.ivan.lectures.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }
    public void login(String username, String password) {
        typeInfo(By.name("user"),username);
        typeInfo(By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }
}
