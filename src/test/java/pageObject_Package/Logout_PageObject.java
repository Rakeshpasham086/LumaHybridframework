package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_PageObject {
	public static WebDriver driver;
	public Logout_PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btnlogout;
	public void clickOnLogoutbtn() {
		btnlogout.click();
	}
}
