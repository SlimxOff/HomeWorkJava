package ru.ivan.lectures.tests;

import org.testng.annotations.Test;

public class GroupModification extends TestBase{
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().newGroupCreate("FromTest","OfCourse","Finally");
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupsPage();
    }
}
