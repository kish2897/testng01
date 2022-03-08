package IgnoreTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestExample {

	public static WebDriver driver;
	
	@BeforeSuite
	private void setup() {
		
		System.setProperty("webdriver.edge.driver", 
				System.getProperty("user.dir")+(".\\Drivers\\edgedriver_win64\\msedgedriver.exe"));
			System.out.println("launched");

	}
	
	@BeforeTest
	private void browser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver = new EdgeDriver();
		System.out.println("Edge");

	}
	
	@BeforeMethod
     private void url() throws InterruptedException {
    	 
    	 Thread.sleep(2000);
    	 
    	 driver.manage().window().maximize();
 		System.out.println("full Screen");
        
 		driver.get("https://www.facebook.com/");
 		System.out.println("Successfull");

	}
     
	@Test
     private void firstname() {
		
    	 driver.findElement(By.id("email")).sendKeys("Kishore");
    	 System.out.println("FirstName");
	}
     
	@Test @Ignore
     private void password() {
		
    	 driver.findElement(By.name("pass")).sendKeys("Kishore");
         System.out.println("Password");
	}
	
	@AfterSuite
	private void title() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}
	
}
