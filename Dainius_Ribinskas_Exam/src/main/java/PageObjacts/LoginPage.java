package PageObjacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "#username")
    private WebElement inputUserName;

    @FindBy(css = "#password")
    private WebElement inputPassword;

    @FindBy(css = "#submit")
    private WebElement loginButton;

    public WebElement getErrorWebElement() {
        return error;
    }

    @FindBy(css = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void setInputUserName(String userName) {
        inputUserName.sendKeys(userName);

    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButton() {
        loginButton.click();
    }

    public boolean isErrorDisplayed() {
        return error.isDisplayed();
    }

    public WebElement getErrorText() {
        return error.findElement(By.className("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi"));
    }

}





