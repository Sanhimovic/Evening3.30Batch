package test_script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_script1.Pom12;

public class Test12 {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./s1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=dk78grmp2mqnp");
		Pom12 p1=new Pom12(driver);
		Thread.sleep(2000);
		p1.setUsername("admin");
		Thread.sleep(2000);
		p1.setPassword("manager");
		Thread.sleep(2000);
		p1.clickLogin();
	}

}
