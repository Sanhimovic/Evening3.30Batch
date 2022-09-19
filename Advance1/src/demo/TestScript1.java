package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript1 extends Generic_Test1 {
	@Test
	public void validLogin() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//div[.='Login ']"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.click();
	}
}
