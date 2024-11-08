package dataproviderstestng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Dataproviders1 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "loginTestdata") // use the data provider name there is no role to use the data provider name
											// we can
											// also use the methodname (loginTest) in the place of data provider name
											// (loginTestdata).
	public void orangeHRMlogin(String username, String password) throws Exception {

		/*
		 * driver.get("https://trade.mstock.com/#/login"); WebElement
		 * uName1=driver.findElement(By.xpath("//input[@name='username']"));
		 * uName1.sendKeys("hai"); WebElement
		 * Name2=driver.findElement(By.xpath("//input[@name='username']"));
		 * Name2.sendKeys("hekko");
		 */

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement uName = driver.findElement(By.xpath("//input[@name='username']"));
		uName.sendKeys(username);
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		Thread.sleep(2000);

		WebElement loginbutton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		loginbutton.click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='client brand banner']/..")).isDisplayed());

	}

	@AfterMethod
	public void setdown() {
		driver.close();
	}

	@DataProvider(name = "loginTestdata") // there is no need to use the name="loginTestdata" we can use the method name
											// also loginTest.
	public Object[][] loginTest() {
		Object[][] login = new Object[2][2];
		login[0][0] = "Admin";
		login[0][1] = "admin123";

		login[1][0] = "Admm";
		login[1][1] = "1234";

		return login;
		
		
		//Username:     js_na_adm
		//Password:     47%sr<.vV~`!XC.r8?%18,5%x

	}

}
