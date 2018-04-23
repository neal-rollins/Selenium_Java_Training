package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavBar {
    
    // NavBar fields
    WebDriver driver;
    WebDriverWait wait;
    
    // NavBar elements
    private By lnkAdmin = (By.xpath("body > header > div > nav > ul > li:nth-child(1) > a"));
    private By lnkDepartments = (By.xpath("body > header > div > nav > ul > li.dropdown.open > ul > li > a:nth-child(1)"));
    private By lnkTitles = (By.xpath("body > header > div > nav > ul > li.dropdown.open > ul > li > a:nth-child(2)"));
    private By lnkEmailUsers = (By.xpath("body > header > div > nav > ul > li.dropdown.open > ul > li > a:nth-child(3)"));
    private By lnkMessageCenter = (By.xpath("body > header > div > nav > ul > li:nth-child(2) > a"));
    private By lnkCalendar = (By.xpath("body > header > div > nav > ul > li:nth-child(3) > a"));
    private By lnkCalendarCarrot = (By.xpath("body > header > div > nav > ul > li.dropdown.visible-lg.visible-md.visible-sm > a > b"));
    private By lnkCalendarReporting = (By.xpath("body > header > div > nav > ul > li.dropdown.visible-lg.visible-md.visible-sm.open > ul > li > a"));
    private By lnkDirectory = (By.xpath("body > header > div > nav > ul > li:nth-child(5) > a"));
    private By lnkProjects = (By.xpath("body > header > div > nav > ul > li:nth-child(6) > a"));
    private By lnkEmployees = (By.xpath("body > header > div > nav > ul > li:nth-child(7) > a"));
    private By lnkLogout = (By.xpath("body > header > div > nav > ul > li:nth-child(8) > a"));
    private By lnkHelp = (By.xpath("#help-btn"));
    
    
    // NavBar constructor
    public NavBar(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver, (long)10.0);
    }
    

    // Navbar functions
     private void navigateToDepartments(WebDriver driver, WebDriverWait wait){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkAdmin)));
        driver.findElement(lnkAdmin).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkDepartments)));
        driver.findElement(lnkDepartments).click();
    }
    
    private void navigateToTitles() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkAdmin)));
        driver.findElement(lnkAdmin).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkTitles)));
        driver.findElement(lnkTitles).click();
    }
    
    private void navigateToEmailUsers() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkAdmin)));
        driver.findElement(lnkAdmin).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkEmailUsers)));
        driver.findElement(lnkEmailUsers).click();
    }
    
    private void navigateToMessageCenter() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkMessageCenter)));
        driver.findElement(lnkMessageCenter).click();
    }
    
    private void navigateToCalendar() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkCalendar)));
        driver.findElement(lnkCalendar).click();
    }
    
    private void navigateToReporting() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkCalendarCarrot)));
        driver.findElement(lnkCalendarCarrot).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkCalendarReporting)));
        driver.findElement(lnkCalendarReporting).click();
    }
    
    private void navigateToDirectory() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkDirectory)));
        driver.findElement(lnkDirectory).click();
    }
    
    private void navigateToProjects() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkProjects)));
        driver.findElement(lnkProjects).click();
    }
    
    private void navigateToEmployees() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkEmployees)));
        driver.findElement(lnkEmployees).click();
    }
    
    private void navigateToLogout() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkLogout)));
        driver.findElement(lnkLogout).click();
    }
    
    private void navigateToHelp() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(lnkHelp)));
        driver.findElement(lnkHelp).click();
    }
}
