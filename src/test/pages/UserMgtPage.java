package pages;

import bases.BasesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserMgtPage extends BasesPage {
    public String[] registrationFormFields;
    protected WebDriver driver;
    public UserMgtPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[contains(text(),'User-Mgt')]")
    public WebElement userMgtbth;

    @FindBy(xpath = "//button[@id='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[@id='access-db-btn']")
    public WebElement accessBtn;

    @FindBy(xpath = "//input[@id='Firstname']")
    public WebElement firstnameInput;

    @FindBy(xpath = "//input[@id='Lastname']")
    public WebElement lastnameInput;

    @FindBy(xpath = "//input[@id='Phonenumber']")
    public WebElement phoneInput;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailInput; //select[@id='Select-role']

    @FindBy(xpath = "//select[@id='Select-role']")
    public WebElement selectRole;

    @FindBy(xpath = "//tbody/tr/td")
    public List<WebElement> table;

    @FindBy(id= "clear-btn")
    public WebElement clearBtn;

    @FindBy(id = "submit-btn")
    public WebElement submitBtn;
}