package homework.tests;

import homework.appmanager.ApplicationManagerContact;
import homework.appmanager.ContactHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase{

    protected final ApplicationManagerContact applicationManagerContact = new ApplicationManagerContact();

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        applicationManagerContact.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        applicationManagerContact.stop();
    }

}
