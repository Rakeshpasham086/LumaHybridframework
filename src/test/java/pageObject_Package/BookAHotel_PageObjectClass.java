package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAHotel_PageObjectClass {
	public static WebDriver driver;
	public Select sc;
	public BookAHotel_PageObjectClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	WebElement txtfirstname;
	@FindBy(id="last_name")
	WebElement txtlastname;
	@FindBy(id="address")
	WebElement txtaddress;
	@FindBy(id="cc_num")
	WebElement txtcreditcard;
	@FindBy(id="cc_type")
	WebElement drpcardtype;
	@FindBy(id="cc_exp_month")
	WebElement drpcardexpmonth;
	@FindBy(id="cc_exp_year")
	WebElement drpexpyear;
	@FindBy(id="cc_cvv")
	WebElement txtcvvnumber;
	@FindBy(id="book_now")
	WebElement btnbooknow;
	public void setFirstname() {
		txtfirstname.sendKeys("Rakesh");
	}
	public void setLastname() {
		txtlastname.sendKeys("Pasham");
	}
	public void setAddress() {
		txtaddress.sendKeys("Hyderabad, Telanagana");
	}
	public void setCredicardnum() {
		txtcreditcard.sendKeys("1234567890123456");
	}
	public void setCCnum() {
		sc=new Select(drpcardtype);
		sc.selectByIndex(2);
	}
	public void setCardexpmonth() {
		sc=new Select(drpcardexpmonth);
		sc.selectByVisibleText("February");
	}
	public void setCardexpyear() {
		sc=new Select(drpexpyear);
		sc.selectByValue("2028");
	}
	public void setCvvNum() {
		txtcvvnumber.sendKeys("123");
	}
	public void clickOnBooknow_btn() {
		btnbooknow.click();
	}
}
