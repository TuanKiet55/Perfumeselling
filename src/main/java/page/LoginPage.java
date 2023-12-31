package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameTxt = By.name("username");
    private By passwordTxt = By.name("password");
    private By loginButton = By.cssSelector("div.oxd-form-actions.orangehrm-login-action button.orangehrm-login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(userNameTxt).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public HomePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }


}
