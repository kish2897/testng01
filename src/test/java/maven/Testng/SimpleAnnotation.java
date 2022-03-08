package maven.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeSuite
	public void sample1() {
		
		System.out.println("Before TestNG");

	}
	
	@BeforeTest
	public void sample2() {
		
		System.out.println("Before Test");

	}
	
	@BeforeClass
    private void sample3() {
	
    	System.out.println("Before Class");
}
    @BeforeMethod
    private void sample4() {
		
    	System.out.println("Before Method");

	}
    
    @Test
    private void sample() {
		
    	System.out.println("Test");

	}
    
    @Ignore
    @Test
    private void avoid() {
		
    	System.out.println("test should be ignore");

	}
    
    @AfterMethod
    private void sample5() {
	
    	System.out.println("After Method");
}
    
    @AfterClass
    private void sample6() {
		
    	System.out.println("After Class");
    	
	}
    
    @AfterTest
    private void sample7() {
		
    	System.out.println("After test");

	}
    
    @AfterSuite
    private void sample8() {
		
    	System.out.println("After Suite");

	}
    
}
