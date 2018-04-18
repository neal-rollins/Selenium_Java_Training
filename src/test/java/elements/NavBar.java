package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NavBar {
    
    // NavBar fields
    WebDriver driver;
    WebDriverWait wait;
    
    // NavBar elements
    @FindBy(linkText = "Logout")
    private WebElement lnkLogout;
    
    @FindBy(className = "dropdown")
    private WebElement dropdowns[];
    
    // must click adminDropdown to access lnkDepartments, lnkTitles and lnkEmailModal
    private WebElement adminDropdown = dropdowns[0];
    
    @FindBy(linkText = "departments")
    private WebElement lnkDepartments;
    
    @FindBy(linkText = "title")
    private WebElement lnkTitles;
    
    @FindBy(css = "a[data-target=\"#email_all_modal\"]")
    private WebElement lnkEmailModal;
    
    // must click calendarDropdown to access lnkVacationReporting
    private WebElement calendarDropdown = dropdowns[1];
    
    @FindBy(css = "a[data-target=\"#vacation_reporting_modal\"]")
    private WebElement lnkVacationReporting;
    
    @FindBy(css = "a[data-target=\"#notification_modal\"]")
    private WebElement lnkMessageCenterModal;
    
    @FindBy(css = "a[href=\"/calendar]")
    private WebElement lnkCalendar;
    
    @FindBy(linkText = "directory")
    private WebElement lnkDirectory;
    
    @FindBy(linkText = "projects")
    private WebElement lnkProjects;
    
    @FindBy(linkText = "/")
    private WebElement lnkEmployees;
    
    // NavBar default constructor
    public NavBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver, (long)10.0);
    }
    
    // NavBar functions
    public boolean navBarVisible(){
        return lnkLogout.isDisplayed();
    }
}