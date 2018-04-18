package tests;

import pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginPageTest {
    
    @Test
    public void test() {
    
        // Init ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://bluesourcestaging.herokuapp.com/login");
        
        // Init loginPage
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.login();;
        
    }
    
}
