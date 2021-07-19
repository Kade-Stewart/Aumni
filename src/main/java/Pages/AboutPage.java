package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage extends BaseClass{

    public AboutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void logPageTitle(){
        wait.until(ExpectedConditions.urlContains("about"));
        System.out.println("Expected page title: About Aumni");
        System.out.println("Returned page title: " + driver.getTitle() );
    }

    public void logPageUrl(){
        System.out.println("Expected page Url: https://www.aumni.fund/about");
        System.out.println("Returned page Url: " + driver.getCurrentUrl());
    }

}
