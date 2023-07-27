package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessfully(){
        loginPage.setUserName("admin");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();

    }

    @Test
    @DisplayName("TC02-Login successfully")
    public void testLoginFaile(){
        loginPage.setUserName("admin1");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();

    }





    @AfterEach
    public void tearDown(){
//        driver.quit();
    }

    public static void main(String[] args) {
        BaseTest base = new BaseTest();
        base.setUp();
    }

}
