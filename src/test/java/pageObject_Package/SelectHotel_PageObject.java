package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_PageObject {
	public static WebDriver driver;
	public SelectHotel_PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_1")
	WebElement btnselect;
	@FindBy(id="continue")
	WebElement btncontinue;
	public void clickOnbtn() {
		btnselect.click();
	}
	public void clickOnContinuebtn() {
		btncontinue.click();
	}
	
}
