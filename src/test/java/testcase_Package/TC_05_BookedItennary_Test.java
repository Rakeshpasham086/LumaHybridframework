package testcase_Package;

import org.testng.annotations.Test;

import pageObject_Package.BookAHotel_PageObjectClass;
import pageObject_Package.BookedItenary_PageObject;
import pageObject_Package.Loginpage_ObjectClass;
import pageObject_Package.SearchHotel_PageObject;
import pageObject_Package.SelectHotel_PageObject;
import reusable_Package.Base_Class;

public class TC_05_BookedItennary_Test extends Base_Class {
	public BookedItenary_PageObject bi;
	@Test
	public void bookedItinerary() {
		Loginpage_ObjectClass lp=new Loginpage_ObjectClass(driver);
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
		SelectHotel_PageObject sc=new SelectHotel_PageObject(driver);
		sc.clickOnbtn();
		sc.clickOnContinuebtn();
		BookAHotel_PageObjectClass bh=new BookAHotel_PageObjectClass(driver);
		bh.setFirstname();
		bh.setLastname();
		bh.setAddress();
		bh.setCredicardnum();
		bh.setCCnum();
		bh.setCardexpmonth();
		bh.setCardexpyear();
		bh.setCvvNum();
		bh.clickOnBooknow_btn();
		bi=new BookedItenary_PageObject(driver);
		bi.clickOnlink();
	}

}
