package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBufferPage extends BaseClass{

    public LoginBufferPage(WebDriver driver){
            this.driver = driver;
    }

    public void clickLoginButton(){
        driver.findElement(By.xpath("//button[@class='login-page-dialog-button']")).click();
    }

}
