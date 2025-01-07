package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethods {
	public static WebDriver driver;
	@BeforeClass
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void register(){
		driver.findElement(By.id("firstname")).sendKeys("Rakesh");
		driver.findElement(By.id("lastname")).sendKeys("Reddy");
		driver.findElement(By.id("email_address")).sendKeys("rakeshreddy008@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456@R");
		driver.findElement(By.id("password-confirmation")).sendKeys("123456@R");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}
	@Test(dependsOnMethods= {"logout"})
	public void login() {
		driver.findElement(By.xpath("(//ul[@class='header links'])[1]/li[2][@class='authorization-link']")).click();
		driver.findElement(By.id("email")).sendKeys("rakeshreddy7262@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456@R");
		driver.findElement(By.id("send2")).click();
	}
	@Test(dependsOnMethods= {"register"})
	public void logout() throws InterruptedException{
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//ul[@class='header links'])[2]/li[3][@class='authorization-link']")).click();
		Thread.sleep(5000);	
		
	}

}
