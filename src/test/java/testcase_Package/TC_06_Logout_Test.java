package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.Loginpage_ObjectClass;
import pageObject_Package.Logout_PageObject;
import reusable_Package.Base_Class;

public class TC_06_Logout_Test extends Base_Class{
	public Logout_PageObject lg;
	@Test
	public void logout() {
		Loginpage_ObjectClass lp=new Loginpage_ObjectClass(driver);
		lp=new Loginpage_ObjectClass(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickOnLogin();
		lg=new Logout_PageObject(driver);
		lg.clickOnLogoutbtn();
	}

}
