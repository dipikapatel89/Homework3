package customerTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerValidation {
	 WebDriver driver;
	 By USER_NAME_FIELD=By.xpath("//input[@id='username']");
		By USER_PASSWORD_FIELD=By.xpath("//input[@id='password']");
	    By SIGNIN_BUTTON_FIELD=	By.xpath("/html/body/div/div/div/form/div[3]/button");
	    By CUSTOMER=By.xpath("//span[contains(text(),'Customers')]");
	    By ADD_CUSTOMER=By.xpath("//a[contains(text(),'Add Customer')]");
		
		@Before
		public void Launchbrowser() 
		{
			System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@Test
		public void testForm()
		{
			
		    
		    driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		    driver.findElement(USER_PASSWORD_FIELD).sendKeys("abc123");
			driver.findElement(SIGNIN_BUTTON_FIELD).click();
			driver.findElement(CUSTOMER).click();
			driver.findElement(ADD_CUSTOMER).click();
		}
}
