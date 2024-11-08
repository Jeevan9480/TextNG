package demoTestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter1 {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void browserhandel(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Invalid browserName");
			break;
		}
		driver.manage().window().maximize();
	}

	@Parameters("url")
	@Test
	public void lunchUrl(String url) throws Throwable {
		driver.get(url);
		Thread.sleep(3000);
	}
   @Parameters({"userName","password"})
	@Test
	public void hrmLogi(String userName , String password) throws Exception {
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(3000);

	}

	@Test

	public void verifyMyinfo() throws Exception {
		boolean actualvalue = driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();
		assertTrue(actualvalue);
		WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
		pim.click();
		Thread.sleep(3000);

	}

	@Test
	public void addEmployee() throws Throwable {
		WebElement AddEmployeebutton = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		assertTrue(AddEmployeebutton.isDisplayed());
		System.out.println(AddEmployeebutton.getText());
		AddEmployeebutton.click();
		Thread.sleep(3000);
	}


	  @AfterTest public void closes() throws Exception { 
		  driver.quit();
		  Thread.sleep(2000);
		  }
	

}
