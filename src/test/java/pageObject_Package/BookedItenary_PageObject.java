package pageObject_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenary_PageObject {
	public static WebDriver driver;
	public BookedItenary_PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	WebElement btnbookeditenary;
	public void clickOnlink() {
		btnbookeditenary.click();
	}
}
