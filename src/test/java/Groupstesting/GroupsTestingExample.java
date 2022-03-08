package Groupstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsTestingExample {
	
	       public static WebDriver driver;
           
	       @Test(groups = "A")
	       private void asetup() {
	   		
	   		System.setProperty("webdriver.chrome.driver", 
	   				System.getProperty("user.dir")+(".\\Drivers\\chromedriver_win32\\chromedriver.exe"));
	   			System.out.println("full");
	   			

	   	}
	       
	       @Test(groups = "A")
	       private void browser() throws InterruptedException {
	   		
	   		Thread.sleep(2000);
	   		driver = new ChromeDriver();
	   		System.out.println("full");
	   		
	    }
	       
	       @Test(groups = "A")
	       private void full() throws InterruptedException {
			
	    	   Thread.sleep(2000);
	    	   driver.manage().window().maximize();
	    	   System.out.println("full");
	    	   

		}
	       
	       @Test(groups = "k")
	       private void hurl() {
			
	    	   driver.get("https://www.facebook.com/");

		}
	       @Test(groups = "k")
	       private void isername() throws InterruptedException {
			
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.id("email")).sendKeys("kishore");
               
		}
	       
	       @Test(groups = "k")
	       private void password() throws InterruptedException {
			   
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.id("passContainer")).sendKeys("kishore");

		}
	       
	       @Test(groups= "B")
	       private void qcreate() throws InterruptedException {
			   
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.id("u_0_2_v1")).click();

		}
	       
	       @Test(groups = "C")
	       private void rirstname() throws InterruptedException {
			   
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.name("firstname")).sendKeys("kanchu");

		}
	       @Test(groups = "C")
	       private void slastname() throws InterruptedException {
			
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.name("lastname")).sendKeys("kanchu");

		}
	       
}
