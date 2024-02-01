import PageObjacts.LoginPage;
import PageObjacts.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static WaitUtil.WaitUtilities.waitForDisplay;

public class RegTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    String inputRegName = "Test";
    String inputRegPassword = "Test_1";
    String inputRegPasswordConfirm = "Test_1";

    String invalidInputRegName = "Test_3";
    String invalidInputRegPassword = "Test_4";

    @Test
    void userCanRegister() {

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        loginPage.setInputUserName(inputRegName);
        loginPage.setInputPassword(inputRegPassword);
        loginPage.setInputPassword(inputRegPasswordConfirm);
        loginPage.clickButton();
        Assertions.assertEquals("Skaičiuotuvas", mainPage.getTitle());
    }

    @Test
    void userCannotRegister() {

        loginPage = new LoginPage(driver);
        loginPage.setInputUserName(invalidInputRegName);
        loginPage.setInputPassword(invalidInputRegPassword);
        loginPage.setInputPassword(invalidInputRegPassword);
        loginPage.clickButton();
        waitForDisplay(driver, loginPage.getErrorText());
        Assertions.assertTrue(loginPage.isErrorDisplayed());
       Assertions.assertEquals("Toks vartotojo vardas jau egzistuoja", loginPage.getErrorText());
    }

}
