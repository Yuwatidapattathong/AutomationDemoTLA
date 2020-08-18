package pages;

import bases.BasesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasesPage {
    WebDriver driver;
    public CommonPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement findById(String id) {
        return driver.findElement(By.id(id));
    }
}

