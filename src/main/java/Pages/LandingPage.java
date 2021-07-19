package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage extends BaseClass{

    public LandingPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void clickLogin(){
        driver.findElement(By.xpath("//div[@class='flex flex-center nav-col']/a[2]")).click();
    }

    public void clickAboutDropdown(){
        driver.findElement(By.id("w-dropdown-toggle-3")).click();
    }

    public void clickAbout(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/about']")));
        driver.findElement(By.xpath("//a[@href='/about']")).click();
    }

    public void clickGetADemo(){
        driver.findElement(By.xpath("//div[@class='flex flex-center nav-col']/a[3]")).click();
    }

}
