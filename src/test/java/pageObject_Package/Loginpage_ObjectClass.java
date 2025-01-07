package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_ObjectClass {
	public static WebDriver driver;
	public Loginpage_ObjectClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement txtusername;
	@FindBy(id="password")
	WebElement txtpassword;
	@FindBy(id="login")
	WebElement btn_login;
	public void setUsername() {
		txtusername.sendKeys("RakeshreddyP");
	}
	public void setPassword() {
		txtpassword.sendKeys("123456@R");
	}
	public void clickOnLogin() {
		btn_login.click();
	}
	

}
