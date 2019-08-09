import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import step.AccountStep;
import step.LoginStep;
import step.MainStep;
import util.Helper;
import util.JsonDataReader;
import util.WaitUtils;

import java.util.Map;

public class CommentAllPhotos {

    protected WebDriver driver;

    private static Map<String, String> userData;
    private static Map<String, String> personData;

    private LoginStep loginStep;
    private MainStep mainStep;
    private AccountStep accountStep;

    @BeforeClass
    public void preparationForTest() {
        driver = WebDriverManager.getDriver();
        userData = JsonDataReader.getUserData();
        personData = JsonDataReader.getPersonData();
        loginStep = new LoginStep(driver);
        mainStep = new MainStep(driver);
        accountStep = new AccountStep(driver);
    }

    @Test
    public void likeAllPhotos(){
        String login = userData.get("login");
        loginStep.setLogin(login);
        String password = userData.get("password");
        loginStep.setPassword(password);
        loginStep.clickLoginButton();
        WaitUtils.sleep(5000);
        Helper.refreshPage();
        mainStep.clickNotNowButton();
        String person = personData.get("person");
        mainStep.setPerson(person);
        WaitUtils.sleep(3000);
        Helper.clickEnter();
        Helper.clickEnter();
        WaitUtils.sleep(3000);
        accountStep.clickFirstImg();
        accountStep.setCommentsForAllPhotos("I LOVE YOU !!!");
    }
}
