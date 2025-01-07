package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hard_Assert {

	public static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeSuite
	public void openApp(String br, String URL) {
		if (br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (br.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else if (br.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	}
	@Test(priority=1)
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(priority=2)
	public void verificationofswaglabs()

	{
		String act_title=driver.getTitle();
		String Exp_title="Swag Labs";
	
//		if(act_title.equals(Exp_title))
//		{
//		
//			System.out.println("testcase is passed");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//	}
		Assert.assertEquals(act_title, Exp_title);
	}
}
