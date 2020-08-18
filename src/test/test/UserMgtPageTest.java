package test;

import bases.BasesPage;
import bases.BasesTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.UserMgtPage;
import utils.ScreenShot;

import java.lang.reflect.Method;

public class UserMgtPageTest extends BasesTest {
    HomePage homePage;
    UserMgtPage userMgtPage;
    CommonPage commonPage;





    @BeforeMethod
    public void setUp(Method method, ITestResult iTestResult){
        super.setUp(method,iTestResult);
        userMgtPage = new UserMgtPage(getDriver());
        commonPage = new CommonPage(getDriver());
        homePage.clickNavBtn("User-Mgt");
    }
    @Test(description =  "Verifying title of User Management Page")
    public void verifyTitle(){
        homePage.clickNavBtn("User-Mgt");
        Assert.assertEquals(getDriver().getTitle(),"Register new user");
    }
    @Test(description = "validating Login and access DB button")
    public void verifyLoginAccessDB_buttons(){
        Assert.assertTrue(userMgtPage.accessBtn.isDisplayed());
        Assert.assertTrue(userMgtPage.loginBtn.isDisplayed());
        ScreenShot.takeScreenshotAndLog();
    }
    @Test(description = "Testing Registration Form fields")
    public void verifyRgtForm(){
        for(String field: userMgtPage.registrationFormFields){
            Assert.assertTrue(commonPage.findById(field).isDisplayed());
            extentTest.log(LogStatus.PASS,commonPage.findById(field).getAttribute("name" + "was displayed"));
        }
        ScreenShot.takeScreenshotAndLog();
    }
    @Test(description = "verifying table has no data initially ")
    public void verifyTableContentIsZero(){
        Assert.assertFalse(userMgtPage.selectRole.isDisplayed());
        extentTest.log(LogStatus.PASS, "Table is not displayed");
        ScreenShot.takeScreenshotAndLog();
    }
 }