package homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBaseContact {
    protected WebDriver wd;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public  void goToMainPage() {
        click(By.linkText("home"));
    }

    public  void submitDelete() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public  void chooseContact() {
        click(By.name("selected[]"));
    }
    public void acceptAlert(){
        wd.switchTo().alert();
    }

    public void submitEdit() {
      click(By.xpath("//div[@id='content']/form/input[22]"));
    }

    public  void editContact() {
      click(By.xpath("//img[@alt='Edit']"));
    }

    public void createUser() {
      initContactCreation();
      fillGroupInfo("ivan", "dimtre", "opoert", "8925748394", "moscow", "moscow", "ivanff@mai.ru");
      submitContactCreation();
    }

    private void submitContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillGroupInfo(String name, String middleName, String lastName, String phoneNumber, String adress, String adress2, String mail) {
      type(By.name("firstname"),name);
      type(By.name("middlename"),middleName);
      type(By.name("lastname"),lastName);
      type(By.name("mobile"),phoneNumber);
      type(By.name("address"),adress);
      type(By.name("address2"),adress2);
      type(By.name("email"),mail);
    }

    private void initContactCreation() {
      click(By.linkText("add new"));
    }
}
