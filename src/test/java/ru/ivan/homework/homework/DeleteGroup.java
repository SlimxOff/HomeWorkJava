package ru.ivan.homework.homework;

import org.testng.annotations.*;

public class DeleteGroup extends TestBase{
  @Test
  public void testDeleteGroup() throws Exception {
    login("admin","secret");
    goToGroupsPage();
    selectGroup();
    deleteSelectedGroups();
    goToGroupsPage();
  }

}
