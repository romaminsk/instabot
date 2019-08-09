package step;

import org.openqa.selenium.WebDriver;
import pageobject.AccountPage;
import pageobject.LoginPage;
import pageobject.MainPage;

public abstract class BaseStep {

    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected AccountPage accountPage;

    public BaseStep(WebDriver driver){
        this.loginPage = new LoginPage(driver);
        this.mainPage = new MainPage(driver);
        this.accountPage = new AccountPage(driver);
    }

}
