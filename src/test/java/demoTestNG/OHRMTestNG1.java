package demoTestNG;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMTestNG1 {
	WebDriver driver;    // Declare WebDriver instance at the class level.
	@BeforeClass
	@Test
	public void LunchApp() throws Exception { 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void LoginHRM() throws Exception {
		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		Thread.sleep(3000);
			
	}
	
	@Test
	public void PIMclick() throws Exception {
		Thread.sleep(2000);
		WebElement PIMbutton=driver.findElement(By.xpath("//span[text()='PIM']"));
		PIMbutton.click();
		Thread.sleep(3000);
		WebElement AddEmployeebutton=driver.findElement(By.xpath("//a[text()='Add Employee']"));
		AddEmployeebutton.click();
		Thread.sleep(3000);
	}
	@Test
	public void Logout() throws Throwable {
		
		WebElement Account=driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
		Account.click();
		WebElement Logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		Logout.click();
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	
	public void AddEmployee() throws InterruptedException {
		Thread.sleep(2000);
		WebElement EmpFirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		EmpFirstName.sendKeys("jeevan");
		WebElement EmpmiddleName=driver.findElement(By.xpath("//input[@name='middleName']"));
		EmpmiddleName.sendKeys("KS");
		WebElement EmplastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		EmplastName.sendKeys("Sringeri");
		WebElement EmpID=driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div/input"));
		EmpID.clear();
		EmpID.sendKeys("23402"); 
		Thread.sleep(3000);
		driver.quit();

		
		
	}
	
	

		

}
