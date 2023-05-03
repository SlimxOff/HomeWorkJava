package ru.ivan.lectures.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import ru.ivan.lectures.appmanager.SessionHelper;

public class DeleteGroup extends TestBase {

  @Test
  public void testDeleteGroup(){
//    app.getSessionHelper().login("admin","secret");
    app.getNavigationHelper().goToGroupsPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().goToGroupsPage();
  }

}
