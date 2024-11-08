package dataproviderstestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class ParallelExecution {

	@Test(dataProvider = "Demo")
	public void LoginHRM(String username, String password) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
		WebElement Name = driver.findElement(By.xpath("//input[@name='username']"));
		Name.sendKeys(username);
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys(password);
		Thread.sleep(3000);
		WebElement adminLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		adminLogin.click();
		
		WebElement PIMbutton = driver.findElement(By.xpath("//span[text()='PIM']"));
		PIMbutton.click();
		PIMbutton.isDisplayed();  
		driver.quit();
			
		}
	

	@DataProvider(parallel = true)
	public Object[][] Demo() {
		Object[][] Demo = new Object[2][2];
		Demo[0][0] = "Admin";
		Demo[0][1] = "admin123";

		Demo[1][0] = "Admm";
		Demo[1][1] = "1234";

		return Demo;
	}

}
