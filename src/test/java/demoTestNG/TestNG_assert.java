package demoTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class TestNG_assert {
	@Test
	
	public void googletitle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("simplify3x",Keys.ENTER);
		String expectedTitle="simplify3x - Google Search";
		String actualTitle=driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		assertEquals(expectedTitle, actualTitle,"Title misss match");
		Thread.sleep(3000);
		//driver.quit();

	}

}
