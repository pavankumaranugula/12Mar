package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (id="firstName")
	WebElement txt_fname;
	@FindBy (id="lastName")
	WebElement txt_lname;
	
	@FindBy (id="email")
	WebElement txt_email;
	@FindBy (id="password")
	WebElement txt_pwd;
	@FindBy (xpath="//button[@id='submit']")
	WebElement btn_submit;
	public void setFirstname() {
		txt_fname.sendKeys("pavan");
	}
	public void setLastname() {
		txt_lname.sendKeys("kumar");
	}
	public void setEmail() {
		txt_email.sendKeys("pavan@gmail.com");
	}
	public void setPassword() {
		txt_pwd.sendKeys("Pavan@123");
	}
	public void clickSubmit() {
		btn_submit.click();
	}
}

			


