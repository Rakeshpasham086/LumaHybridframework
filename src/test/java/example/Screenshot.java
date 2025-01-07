package example;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		TakesScreenshot scrnsht=(TakesScreenshot)driver;
		WebElement e1=driver.findElement(By.id("login_button_container"));
		
		File source=e1.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\Hp\\eclipse-workspace\\Testing_project\\Screenshots\\particular.png");
		FileUtils.copyFile(source, target);
	}
	

}
