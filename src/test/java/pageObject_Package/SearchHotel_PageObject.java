package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel_PageObject {
	public static WebDriver driver;
	public Select sc;
	public SearchHotel_PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	WebElement drplocation;
	@FindBy(id="room_nos")
	WebElement drprooms;
	@FindBy(id="datepick_in")
	WebElement txtdatepickin;
	@FindBy(id="datepick_out")
	WebElement txtdatepickout;
	@FindBy(id="adult_room")
	WebElement drpadults;
	@FindBy(id="Submit")
	WebElement btnsearch;
	public void setLocation() {
		sc=new Select(drplocation);
		sc.selectByIndex(1);
		
	}
	public void setRoomsnos() {
		sc=new Select(drprooms);
		sc.selectByIndex(2);
	}
	public void setDatepickin() {
		txtdatepickin.sendKeys("20-12-2024");
	}
	public void setDatepickout() {
		txtdatepickout.sendKeys("21-12-2024");
	}
	public void setAdultperroom() {
		sc=new Select(drpadults);
		sc.selectByIndex(2);
	}
	public void clickOnSearchbtn() {
		btnsearch.click();
	}
}
