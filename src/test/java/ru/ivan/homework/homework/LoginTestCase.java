package ru.ivan.homework.homework;

import org.testng.annotations.*;

public class LoginTestCase extends TestBase {

  @Test
  public void testLoginTestCase() throws Exception {
    login("admin","secret");
    goToGroupsPage();
    newGroupCreate();
    goToGroupsPage();
    logout();
  }

}
