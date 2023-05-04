package homework.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{
    @Test
    public void deleteContact(){
        applicationManagerContact.getContactCreateHelper().chooseContact();
        applicationManagerContact.getContactCreateHelper().submitDelete();
        applicationManagerContact.closeAlertAndGetItsText();
        applicationManagerContact.getContactCreateHelper().goToMainPage();
    }

}
