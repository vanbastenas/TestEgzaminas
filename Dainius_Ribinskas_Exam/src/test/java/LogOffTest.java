import PageObjacts.LoginPage;
import PageObjacts.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LogOffTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    String inputUserName = "Test";
    String inputPassword = "Test_1";
    @Test
    void userLogOff() {

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        loginPage.setInputUserName(inputUserName);
        loginPage.setInputPassword(inputPassword);
        loginPage.clickButton();
        assertEquals("Skaičiuotuvas", mainPage.getTitle());
        driver.findElement(By.linkText("Logout, useris")).click();

    }
}
