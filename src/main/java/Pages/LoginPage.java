package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void sendCredentials(String userID, String password){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userID);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }

    public String getErrorMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='animated fadeInUp']")));
        return driver.findElement(By.xpath("//span[@class='animated fadeInUp']")).getText();
    }

}
