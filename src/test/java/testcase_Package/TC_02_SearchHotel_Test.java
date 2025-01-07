package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.Loginpage_ObjectClass;
import pageObject_Package.SearchHotel_PageObject;
import reusable_Package.Base_Class;

public class TC_02_SearchHotel_Test extends Base_Class {
	public SearchHotel_PageObject sh;
	@Test
	public void search_Hotel() {
		Loginpage_ObjectClass lp=new Loginpage_ObjectClass(driver);
		lp=new Loginpage_ObjectClass(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickOnLogin();
		sh=new SearchHotel_PageObject(driver);
		sh.setLocation();
		sh.setRoomsnos();
		sh.setDatepickin();
		sh.setDatepickout();
		sh.setAdultperroom();
		sh.clickOnSearchbtn();
	}

}
