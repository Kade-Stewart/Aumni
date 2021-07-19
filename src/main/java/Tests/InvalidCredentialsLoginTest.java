package Tests;

import Pages.LandingPage;
import Pages.LoginBufferPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvalidCredentialsLoginTest extends BaseTest{

    protected String userID = "Email@Email.com";
    protected String password = "password";

    @Test(priority = 3)
    public void testIncorrectLogin(){
        landingPage = new LandingPage(driver);
        landingPage.clickLogin();

        loginBufferPage = new LoginBufferPage(driver);
        loginBufferPage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.sendCredentials(userID, password);
        loginPage.clickLogin();
        Assert.assertEquals("WRONG EMAIL OR PASSWORD.", loginPage.getErrorMessage());
   }

}
