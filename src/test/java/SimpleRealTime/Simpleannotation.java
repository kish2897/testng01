package SimpleRealTime;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Simpleannotation {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.edge.driver", 
			System.getProperty("user.dir")+(".\\Drivers\\edgedriver_win64\\msedgedriver.exe"));
		System.out.println("launched");
		
		
	}
	
	@BeforeMethod
	private void website() throws InterruptedException {
		Thread.sleep(2000);
		driver = new EdgeDriver();
		System.out.println("chrome");

	}
	
	@Test
	public void url() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		System.out.println("full Screen");
       
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	

	@AfterMethod
	public void title() throws InterruptedException {
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	@AfterSuite
	
	public void refresh() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("refresh");

	}
	
	
}
