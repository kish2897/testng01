package PriorityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTestExample {
	
	public static WebDriver driver;
	public static Actions a;
	
	@BeforeSuite
	private void setup() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+(".\\Drivers\\chromedriver_win32\\chromedriver.exe"));
			System.out.println("launched");

	}
	
	@BeforeTest
	private void browser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver = new ChromeDriver();
		System.out.println("chrome");

	}
	
	@BeforeMethod
     private void url() throws InterruptedException {
    	 
    	 Thread.sleep(2000);
    	 
    	 driver.manage().window().maximize();
 		
        
 		driver.get("https://www.flipkart.com/");
 	

	}
	
	@Test(priority = 1) 
     private void username() {
		
    	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kishorekumar2897@gmail.com");
    	 System.out.println("FirstName");
	}
     
	@Test(priority = 2) 
     private void password() {
		
    	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kishore");
         System.out.println("Password");
	}
	
	@Test(priority = 4)
    private void create() {
		
		driver.findElement(By.xpath("//a[@class='_14Me7y']")).click();
		System.out.println("create");

	}
    
	@Test(priority = 5)
     private void number() {
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("1234567890");
        System.out.println("input");
	}
    
    @Test(priority = 3)
    private void log() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        System.out.println("log");
	}
	
	
	@AfterSuite
	private void title() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
