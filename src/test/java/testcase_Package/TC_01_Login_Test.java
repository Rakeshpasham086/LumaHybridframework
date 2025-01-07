package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.Loginpage_ObjectClass;
import reusable_Package.Base_Class;

public class TC_01_Login_Test extends Base_Class{
	public Loginpage_ObjectClass lp;
	@Test
	public void login_Test() {
		lp=new Loginpage_ObjectClass(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickOnLogin();
	}

}
