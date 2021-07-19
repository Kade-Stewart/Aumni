package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoPage extends BaseClass{

    public DemoPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void sendCredentials(String firstName, String lastName, String email, String company){
        driver.findElement(By.xpath("//input[@name='first-name']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@name='last-name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
        System.out.println("All credential fields filled");
    }

    public void checkSubmitButtonEnabled(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
        System.out.println("Submit Button Enabled: " + driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());
    }

}
