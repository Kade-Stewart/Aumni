package Tests;


import Pages.DemoPage;
import Pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSubmitButtonStatusTest extends BaseTest{

    protected String firstName = "FirstName";
    protected String lastName = "lastName";
    protected String email = "email";
    protected String company = "company";

    @Test(priority = 1)
    public void DemoSubmitButtonStatusTest(){
        landingPage = new LandingPage(driver);
        landingPage.clickGetADemo();

        demoPage = new DemoPage(driver);
        Assert.assertFalse(demoPage.checkSubmitButtonEnabled());
        demoPage.sendCredentials(firstName, lastName, email, company);
        Assert.assertTrue(demoPage.checkSubmitButtonEnabled());

    }

}
