package testcases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.Baseclass;

public class TC_001_New_Registration  extends Baseclass {
	@Test
	public void registrationAccout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		hp.click_signup();
		Thread.sleep(3000);
		rp.setFirstname();
		rp.setLastname();
		rp.setEmail();
		rp.setPassword();
		rp.clickSubmit();
	}
}

