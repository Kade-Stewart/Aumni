package Tests;

import Pages.AboutPage;
import Pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AboutLinkTest extends BaseTest{

    @Test(priority = 0)
    public void AboutLinkTest(){

        landingPage = new LandingPage(driver);
        landingPage.clickAboutDropdown();
        landingPage.clickAbout();

        aboutPage = new AboutPage(driver);
        aboutPage.getPageUrl();

        Assert.assertEquals("About Aumni", aboutPage.getPageTitle());
        Assert.assertEquals("https://www.aumni.fund/about", aboutPage.getPageUrl());
    }

}
