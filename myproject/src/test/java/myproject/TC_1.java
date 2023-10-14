package myproject;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TC_1 {
@Test



		public void testLogin(){
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://google.com");
			Assert.assertEquals(driver.getTitle(), "Google");
			driver.close();
			


	}

}
