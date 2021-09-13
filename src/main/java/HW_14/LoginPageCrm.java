package HW_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageCrm extends BaseWievCrm {

    @FindBy(id = "prependedInput")
    public WebElement inputLogin;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    public HW_14.LoginPageCrm fillInputLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    public HW_14.LoginPageCrm fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    public MainPageCrm clickLoginButton() {
        loginButton.click();
        return new MainPageCrm(driver);
    }

    public void login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    public LoginPageCrm(WebDriver driver) {
        super(driver);
    }
}