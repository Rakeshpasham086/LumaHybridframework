package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Priorities {
	public static WebDriver driver;
	@BeforeSuite
	public void launchapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=3)
	public void login() {
		driver.findElement(By.id("username")).sendKeys("Rakeshreddyp");
		driver.findElement(By.id("password")).sendKeys("123456@R");
		driver.findElement(By.id("login")).click();
		
	}
	@Test(priority=2)
	public void forgot() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		driver.findElement(By.id("emailadd_recovery")).sendKeys("rakeshpasham086@gmail.com");
		driver.navigate().back();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void register() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.id("username")).sendKeys("Rakesh");
		driver.navigate().back();
		Thread.sleep(3000);
	}
	@AfterSuite
	public void closeapp() {
		driver.close();driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

}