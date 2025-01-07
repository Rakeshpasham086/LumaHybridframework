package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewUser_PageObject {
	public static WebDriver driver;
	public RegisterNewUser_PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement linkregister;
	@FindBy(id="username")
	WebElement txtusername;
	@FindBy(id="password")
	WebElement txtpassword;
	@FindBy(id="re_password")
	WebElement txtre_password;
	@FindBy(id="full_name")
	WebElement txtfullname;
	@FindBy(id="email_add")
	WebElement txtemailadd;
	@FindBy(id="captcha-form")
	WebElement txtcaptcha;
	@FindBy(id="tnc_box")
	WebElement clickcheckbox;
	@FindBy(id="Submit")
	WebElement btnsubmit;
	public void clickOnregister() {
		linkregister.click();
	}
	public void setUsername() {
		txtusername.sendKeys("Rakeshreddypasham");
	}
	public void setPassword() {
		txtpassword.sendKeys("123456@PR");
	}
	public void setFullname() {
		txtfullname.sendKeys("Rakesh Reddy Pasham");
	}
	public void setEmailadd() {
		txtemailadd.sendKeys("rakeshreddy@gmail.com");
	}
	public void setCaptcha() throws InterruptedException {
		Thread.sleep(8000);
	}
	public void clickOnCheckbox() {
		clickcheckbox.click();
	}
	public void clickOnSubmit() {
		btnsubmit.click();
	}


}
