package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.RegisterNewUser_PageObject;
import reusable_Package.Base_Class;

public class TC_00_Register_Test extends Base_Class{
	public RegisterNewUser_PageObject nr;
	@Test
	public void newUserRegister() throws InterruptedException {
		nr=new RegisterNewUser_PageObject(driver);
		nr.clickOnregister();
		nr.setUsername();
		nr.setPassword();
		nr.setFullname();
		nr.setEmailadd();
		nr.setCaptcha();
		nr.clickOnCheckbox();
		nr.clickOnSubmit();

	}
}
