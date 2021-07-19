package Tests;

import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected String url = "https://www.aumni.fund/";
    protected String driverPath = "chromedriver.exe";
    protected ChromeDriver driver;
    protected LoginPage loginPage;
    protected LandingPage landingPage;
    protected LoginBufferPage loginBufferPage;
    protected AboutPage aboutPage;
    protected DemoPage demoPage;


    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterTest()
    public void afterTest(){
        try {
            driver.quit();
        }
        catch(Exception e){
            System.out.println("Could not properly quit browser");
        }
    }

}
