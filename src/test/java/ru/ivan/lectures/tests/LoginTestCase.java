package ru.ivan.lectures.tests;

import org.testng.annotations.*;

public class LoginTestCase extends TestBase {

  @Test
  public void testLoginTestCase() {
    app.login("admin","secret");
    app.goToGroupsPage();
    app.newGroupCreate();
    app.goToGroupsPage();
    app.logout();
  }

}
