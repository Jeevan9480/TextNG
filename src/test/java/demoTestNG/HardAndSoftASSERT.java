package demoTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class HardAndSoftASSERT {
		
		@Test
		
		public void testgoogle() throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("simplify3x",Keys.ENTER);
			System.out.println(driver.getTitle());
			String ExceptTitle="simplify3x - Google Search";
			String ActualTitle=driver.getTitle();
			assertEquals(ActualTitle,ExceptTitle,"Title is missmatch");
			Thread.sleep(3000);
			driver.quit();
			}
		
		
	@Test
		
		public void testfacebook() throws Throwable 
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("simplify3x",Keys.ENTER);
			System.out.println(driver.getTitle());
			
			SoftAssert softassert = new SoftAssert();
			// if we not use the softAssert class it is a hard assertion
			//in the hardassertion if the text is faild it will stop the execution 
			//in the soft assertion if the text is fail also it go to the next step 
			//Even if one of these assertions fails, the test will still continue and finish execution.
			//However, TestNG will not consider those failures unless assertAll() is called in the last.

			
			
			//Title assertion
			
	    	String actualTitle=driver.getTitle();
	    	String exceptTitle="Log in to Facebook";
	    	assertEquals(actualTitle,exceptTitle,"title  is missmatch");
			
			//Url assertion
			
			String actualURL=driver.getCurrentUrl();
	    	String exceptURL="https://www.facebook.com/";
	    	assertNotEquals(actualURL,exceptURL,"Url is  missmatch");
	    	
			
			//Test assertion
			
			String actualText=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
			String exceptText="simplify3x";
			assertEquals(actualText,exceptText,"Text is  missmatch");

			
			//Border
			
			String actualBorder=driver.findElement(By.xpath("//input[@name='email']")).getCssValue("border");
			String exceptBorder="0.666667px solid rgb(221, 223, 226)";
			assertEquals(actualBorder,exceptBorder,"border is  missmatch");
			
	    	//Error assertion
//			String actualError=driver.findElement(By.xpath("//input[@id='email']//following::div[2]")).getText();
			String actualError=driver.findElement(By.xpath("//div[@class=\"_9ay7\"][last()]")).getText();
            System.out.print(actualError); 
			String exceptError="The password that you've entered is incorrect. Forgotten password?";
			assertNotEquals(actualError,exceptError,"The text is  missmatch");
			Thread.sleep(3000);
			
			driver.quit();	
			
			
			//Even if one of these assertions fails, the test will still continue and finish execution.
			//However, TestNG will not consider those failures unless assertAll() is called in the last.
			
			softassert.assertAll();
		}
		
		

	}



