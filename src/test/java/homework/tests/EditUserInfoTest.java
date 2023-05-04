package homework.tests;

import org.testng.annotations.*;

public class EditUserInfoTest extends TestBase{


  @Test
  public void testEditContact() {
    applicationManagerContact.getContactCreateHelper().editContact();
    applicationManagerContact.getContactCreateHelper().fillGroupInfo("ivan","goyda","vladimirovich","892523543","ekb","ekb2","ivan@mail.rer");
    applicationManagerContact.getContactCreateHelper().submitEdit();
  }

}
