package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class TestNG_Practice {
	public static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass(groups="smoke")
	public void openApp(String br, String URL) {
		if (br.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (br.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@Test(priority=1,groups="smoke")
	public void login() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("rakeshreddy7262@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456@R");
		driver.findElement(By.id("send2")).click();
		
	}
	@Test
	public void register() {
		driver.findElement(By.id("firstname")).sendKeys("Rakesh");
		driver.findElement(By.id("lastname")).sendKeys("Reddy");
		driver.findElement(By.id("email_address")).sendKeys("rakeshreddy12546@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456@R");
		driver.findElement(By.id("password-confirmation")).sendKeys("123456@R");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		
	}
	@Test(priority=2,groups="smoke")
	public void logout() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
}
	@AfterClass(groups="smoke")
	public void closeApp() {
		driver.close();
	}
}
