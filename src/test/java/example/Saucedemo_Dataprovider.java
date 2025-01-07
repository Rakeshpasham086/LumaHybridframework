package example;

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

public class Saucedemo_Dataprovider {
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
	public void login(String username,  String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.navigate().refresh();
	}
	@DataProvider(name="dp" , indices= {0,1,2,3})
	public String[][] logindata() {
		String data[][]= { 
				
				{"abc_user","123456"},
				{"standard_user","12456"},
				{"Rakeshreddyp","secret_sauce"},
				{"standard_user","secret_sauce"}
				
	};
		return data;
	}
}
