package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeeModal {

    // AddEmployeePage fields
    WebDriver driver;
    WebDriverWait wait;
    
    // AddEmployeesPage elements
    private By txtUsername = By.xpath("//*[@id=\"employee_username\"]");
    private By txtFirstName = By.xpath("//*[@id=\"employee_first_name\"]");
    private By txtLastName = By.xpath("//*[@id=\"employee_last_name\"]");
    private By listTitlesDropDown = By.xpath("//*[@id=\"employee_title_id\"]"); 
    private By listRolesDropDown = By.xpath("//*[@id=\"employee_role\"]");
    private By listManagersDropDown = By.xpath("//*[@id=\\\"employee_manager_id\\\"]");
    private By listStatusDropDown = By.xpath("//*[@id=\\\"employee_status\\\"]");
    private By listLocationDropDown = By.xpath("//*[@id=\\\"employee_location\\\"]");
    private By txtStartDate = By.xpath("//*[@id=\"employee_start_date\"]");
    private By txtCellPhone = By.xpath("//*[@id=\"employee_cell_phone\"]");
    private By txtOfficePhone = By.xpath("//*[@id=\"employee_office_phone\"]");
    private By txtEmail = By.xpath("//*[@id=\"employee_email\"]");
    private By listDepartmentsDropDown = By.xpath("//*[@id=\\\"employee_department_id\\\"]");
    private By btnClose = By.xpath("//*[@id=\"new_employee\"]/div[18]/button");
    private By btnCreateEmployee = By.xpath("//*[@id=\"new_employee\"]/div[18]/input");
    
    // AddEmployeePage functions
    public void setUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtUsername)));
        driver.findElement(txtUsername).sendKeys(username);
    }
    
    public void setFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtFirstName)));
        driver.findElement(txtFirstName).sendKeys(firstName);
    }
    
    public void setLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtLastName)));
        driver.findElement(txtLastName).sendKeys(lastName);
    }
    
    public void selectTitle(String title) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listTitlesDropDown)));
        Select list = new Select(driver.findElement(listTitlesDropDown));
        list.selectByVisibleText(title);
    }
    
    public void selectRole(String role) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listRolesDropDown)));
        Select list = new Select(driver.findElement(listRolesDropDown));
        list.selectByVisibleText(role);
    }
    
    public void selectManager(String manager) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listManagersDropDown)));
        Select list = new Select(driver.findElement(listManagersDropDown));
        list.selectByVisibleText(manager);
    }
    
    public void selectStatus(String status) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listStatusDropDown)));
        Select list = new Select(driver.findElement(listStatusDropDown));
        list.selectByVisibleText(status);
    }
    
    public void selectLocationDropDown(String location) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listLocationDropDown)));
        Select list = new Select(driver.findElement(listLocationDropDown));
        list.selectByVisibleText(location);
    }
    
    public void setStartDate(String startDate) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtStartDate)));
        driver.findElement(txtStartDate).sendKeys(startDate);
    } 
    
    public void setCellPhone(String cellPhone) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtCellPhone)));
        driver.findElement(txtCellPhone).sendKeys(cellPhone);
    }
    
    public void setOfficePhone(String officePhone) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtOfficePhone)));
        driver.findElement(txtOfficePhone).sendKeys(officePhone);
    }
    
    public void setEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtEmail)));
        driver.findElement(txtEmail).sendKeys(email);
    }
    
    public void selectDepartment(String department) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(listDepartmentsDropDown)));
        Select list = new Select(driver.findElement(listLocationDropDown));
        list.selectByVisibleText(department);
    }
    
    public void closeAddEmployeeModal() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(btnClose)));
        driver.findElement(btnClose).click();
    }
    
    public void submitAddEmployeeModal() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(btnCreateEmployee)));
        driver.findElement(btnCreateEmployee).click();
    }

    
    
    
    
    
    
    
}
