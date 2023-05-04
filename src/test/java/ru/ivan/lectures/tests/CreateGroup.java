package ru.ivan.lectures.tests;

import org.testng.annotations.*;

public class CreateGroup extends TestBase {

    @Test
    public void testCreatGroup() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().newGroupButton();
        app.getGroupHelper().newGroupCreate("test1", "ivan", "goyda");
        app.getGroupHelper().submitButton();
        app.getNavigationHelper().goToGroupsPage();
        app.logout();
    }

}