package test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_scripts.Pom1;

public class Login1 {
	
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./s1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=dk78grmp2mqnp");
		Thread.sleep(2000);
		Pom1 p1=new Pom1(driver);
		p1.unTbox("admin");
		Thread.sleep(2000);
		p1.pwdTbox("manager");
		Thread.sleep(2000);
		p1.clickLogin();
	}

}
