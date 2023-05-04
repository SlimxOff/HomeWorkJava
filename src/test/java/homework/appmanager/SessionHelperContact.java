package homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelperContact extends HelperBaseContact{

    public SessionHelperContact(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        submit(By.id("LoginForm"));
    }

    public void logout() {
        click(By.linkText("Logout"));
    }

}
