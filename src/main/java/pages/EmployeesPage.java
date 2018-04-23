package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EmployeesPage {

    // EmployeesPage fields
    WebDriver driver;
    WebDriverWait wait;
    NavBar navBar;
    
    //EmployeesPage elements
    private By txtSearch = By.xpath("#search-bar");
    private By btnAddEmployee = By.xpath("#all-content > div.header-btn-section > div > div.btn-group.pull-right > button");
    private By modalAddEmployee = By.xpath("//*[@id=\"modal_1\"]/div/div");
    private Select listColumnsDropDown = new Select(driver.findElement(By.xpath("#show-hide-columns > button")));
    private Select listEmployeesPerPage = new Select(driver.findElement(By.xpath("#preference_resources_per_page"))); 
    
    // EmployeesPage constructor
    public EmployeesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, (long)10.0);
        PageFactory.initElements(this.driver, this);
        NavBar navBar = new NavBar(driver, wait);  
    }
    
    // EmployeesPage functions
    private void searchEmployees(String searchString) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtSearch)));
        driver.findElement(txtSearch).sendKeys(searchString);
    }
    
    // continue here
    private void addEmployee() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(btnAddEmployee)));
        driver.findElement(btnAddEmployee).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalAddEmployee)));
        AddEmployeeModal addEmployee = new AddEmployeeModal();
    }
    
    private void toggleColumns(String columnName) {
        listColumnsDropDown.selectByVisibleText(columnName);
    }
}
