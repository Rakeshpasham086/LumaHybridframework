package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Data_Provider {
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
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="dp")
	public void login(String username,  String password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		boolean status=driver.findElement(By.xpath("//a[text()='Search Hotel']")).isDisplayed();
		if (status==true) {
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
			
		}
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	@DataProvider(name="dp")
	public String[][] logindata() {
		String data[][]= { 
				{"abc@gmail.com","123456"},
				{"xyz@gmail.com","12456"},
				{"Rakeshreddyp","123456@R"},
				{"prs@gmail.com","45678"},
				{"Rakeshreddyp","12346@R"}
				
	};
		return data;
				
				
				
		
	}
		
	
}
