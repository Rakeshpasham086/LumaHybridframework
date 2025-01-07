package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Invocation {
	public static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void openapp(String br, String URL) {
		if (br.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (br.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else if (br.equals("fiefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("firstname")).sendKeys("Rakesh");
		driver.findElement(By.id("lastname")).sendKeys("Reddy");
		driver.findElement(By.id("email_address")).sendKeys("rakeshreddy1111@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456@R");
		driver.findElement(By.id("password-confirmation")).sendKeys("123456@R");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}
	@Test(invocationCount=3)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//ul[@class='header links'])[2]/li[3][@class='authorization-link']")).click();
		driver.findElement(By.xpath("(//ul[@class='header links'])[1]/li[2][@class='authorization-link']")).click();
		driver.findElement(By.id("email")).sendKeys("rakeshreddy7262@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456@R");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		
		
		
	}


}
