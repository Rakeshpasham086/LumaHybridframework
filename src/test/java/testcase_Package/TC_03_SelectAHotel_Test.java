package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.Loginpage_ObjectClass;
import pageObject_Package.SearchHotel_PageObject;
import pageObject_Package.SelectHotel_PageObject;
import reusable_Package.Base_Class;

public class TC_03_SelectAHotel_Test extends Base_Class{
	public SelectHotel_PageObject sc;
	@Test
	public void selectHotel() {
		Loginpage_ObjectClass lp=new Loginpage_ObjectClass(driver);
		lp=new Loginpage_ObjectClass(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickOnLogin();
		SearchHotel_PageObject sh=new SearchHotel_PageObject(driver);
		sh.setLocation();
		sh.setRoomsnos();
		sh.setDatepickin();
		sh.setDatepickout();
		sh.setAdultperroom();
		sh.clickOnSearchbtn();
		sc=new SelectHotel_PageObject(driver);
		sc.clickOnbtn();
		sc.clickOnContinuebtn();
		
		
		
	}

}
