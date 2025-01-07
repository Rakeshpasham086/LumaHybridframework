package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovide_Example {
	public static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
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
	
	@Test(dataProvider="dp")
	public void login(String username, String pass) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
	}
	@DataProvider(name="dp")
	public String[][] details() {
		String data[][]= {
				{"abc@gmail.com","123456"},
				{"xyz@gmail.com","12456"},
				{"Rakeshreddyp","123456@R"},
				{"prs@gmail.com","45678"},
				{"Rakeshreddyp","12346@R"}
			
		};
		return data;
		
		
	}}
