package parallel_Grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Saucedemo_Testcase {
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
	public void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
