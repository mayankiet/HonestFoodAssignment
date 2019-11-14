package testBase;

import drivers.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.AddToCartPage;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected AddToCartPage addToCartPage;
    public ConfigReader configReader;

    @BeforeMethod
    public void setup() throws IOException {
        driver = new DriverInitializer("chrome").init();
        addToCartPage = new AddToCartPage();
        configReader = new ConfigReader();
    }

    public void navigateToUrl(){
        driver.get(configReader.getUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterMethod
    public void quit(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
