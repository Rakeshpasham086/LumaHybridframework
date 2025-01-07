package reusable_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import pageObject_Package.Loginpage_ObjectClass;

public class Base_Class {
	public static WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br, String URL) {
		if (br.equals("chrome")) {
			driver=new ChromeDriver();			
		}
		else if (br.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	
		}
	
	@AfterClass
	public void closeApp() {
		driver.close();
	}
	

}
