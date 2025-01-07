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

public class Saucedemo_Grouping_Testcase {
	public static WebDriver driver;
	@Parameters({"browser","url"})
	@Test(priority=1 , groups= {"smoke test"})
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
	@Test(priority=2, groups= {"smoke test"})
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(priority=3, groups= {"smoke test"})
	public void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Test(priority=4, groups= {"sanity test"})
	public void closeapp() {
		driver.close();
	}

}
