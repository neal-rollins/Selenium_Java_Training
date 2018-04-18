package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    
    // LoginPage fields
    String username = "company.admin";
    String password = "1234";
    WebDriver driver;
    WebDriverWait wait;

    // LoginPage elements
    private By txtUsername = By.id("employee_username");
    private By txtPassword = By.id("employee_password");
    private By btnLogin = By.name("commit");
    
    // LoginPage default constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver, (long)10.0);
    }    
    
    // LoginPage functions
    public void login(){
        setUsername();
        setPassword();
        clickLogin();
    }
    
    private void setUsername(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtUsername)));
        driver.findElement(txtUsername).sendKeys(username);
    }
    
    private void setPassword(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtPassword)));
        driver.findElement(txtPassword).sendKeys(password);
    }
    
    private void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnLogin)));
        driver.findElement(btnLogin).click();
    }
    
}
