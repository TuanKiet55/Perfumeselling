package login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.LoginPage;

public class LoginTest {
    protected WebDriver driver;
    LoginPage loginPage;
    @Test
    @DisplayName("TC02-Login Fail")
    public void testLoginFail(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage.setUserName("admin");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();
        String alertText = driver.findElement(By.className("oxd-alert oxd-alert--error")).getText();
        Assertions.assertTrue(alertText.contains("Invalid credentials"), "Alert text is incorrect!");
    }

    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessfully(){
        System.out.println("Successer");
    }



}
