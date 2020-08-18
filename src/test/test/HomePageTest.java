package test;

import bases.BasesTest;
import bases.BasesTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.IDynamicGraph;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;


import java.lang.reflect.Method;

public class HomePageTest extends BasesTest {
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void localSetUp(Method method, ITestResult result){
        setUp(method, result);
        homePage = new HomePage(getDriver());
    }

    @Test
    public void verifyTitle(){
        extentTest.log(LogStatus.INFO,"Verify Title Of HomePage");
        screenshot.takeScreenshotAndLog();
        Assert.assertEquals(getDriver().getTitle(), "TLA Automation");
    }


    }