package ru.ivan.lectures.tests;

import org.testng.annotations.*;

public class DeleteGroup extends TestBase {
  @Test
  public void testDeleteGroup(){
    app.login("admin","secret");
    app.goToGroupsPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.goToGroupsPage();
  }

}
