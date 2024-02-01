package PageObjacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends BasePage {


    public RegPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#registruotis")
    private WebElement registerButton;

    public void clickRegisterButton() {
        registerButton.click();
    }

    @FindBy(id = "username")
    private WebElement inputRegName;
    @FindBy(id = "password")
    private WebElement inputRegPassword;
    @FindBy(id = "passwordConfirm")
    private WebElement inputRegPasswordConfirm;
    @FindBy(css = "submit")
    private WebElement registerSubmit;

    @FindBy(tagName = "Logout, useris")
    private WebElement logout;

    public void setInputRegName(String name) {
        inputRegName.sendKeys(name);
    }

    public void setInputRegPassword(String password) {
        inputRegPassword.sendKeys(password);
    }

    public void setInputRegPasswordConfirm(String password) {
        inputRegPasswordConfirm.sendKeys(password);
    }

    public void clickRegisterSubmit() {
        registerSubmit.click();
    }

    public boolean isSkaiciuotuvasDisplayed() {
        return driver.getPageSource().contains("Skaiciuotuvas");
    }

    public WebElement getSkaiciuotuvasText() {
        return driver.findElement(By.id("skaiciuotuvas"));

    }

    public WebElement getErrorWebElement() {
        return regError;}

        @FindBy(css = "Toks vartotojo vardas jau egzistuoja")
        private WebElement regError;
    public boolean isErrorDisplayed() {
        return regError.isDisplayed();
    }
    public WebElement getErrorText() {
        return regError.findElement(By.className("Toks vartotojo vardas jau egzistuoja"));
    }
    public void clickLogout() {
        logout.click();
    }

    }



