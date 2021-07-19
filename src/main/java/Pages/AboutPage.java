package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage extends BaseClass{

    public AboutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public String logPageTitle(){
        String pageTitle = driver.getTitle();
        wait.until(ExpectedConditions.urlContains("about"));
        return pageTitle;
    }

    public String logPageUrl(){
        String pageURL = driver.getCurrentUrl();
        return pageURL;
    }

}
