import PageObjacts.LoginPage;
import PageObjacts.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static WaitUtil.WaitUtilities.waitForDisplay;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    String validUsername = "Test";
    String validPassword = "Test_1";
    String invalidUsername = "Test_3";
    String invalidPassword = "Test_4";

    @Test
    void userCanLogin() {

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        loginPage.setInputUserName(validUsername);
        loginPage.setInputPassword(validPassword);
        loginPage.clickButton();
        Assertions.assertEquals("Skaiciuotuvas", mainPage.getTitle());
    }

    @Test
    void userCannotLogin() {

        loginPage = new LoginPage(driver);
        loginPage.setInputUserName(invalidUsername);
        loginPage.setInputPassword(invalidPassword);
        loginPage.clickButton();
        waitForDisplay(driver, loginPage.getErrorText());
        Assertions.assertTrue(loginPage.isErrorDisplayed());
        Assert.assertEquals("yra neteisingi", loginPage.getErrorText());
    }
}

