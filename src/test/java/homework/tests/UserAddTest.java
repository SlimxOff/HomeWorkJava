package homework.tests;

import org.testng.annotations.*;

public class UserAddTest extends TestBase {

  @Test
  public void testUserAdd() {
    createUser();
    logout();
  }

}
