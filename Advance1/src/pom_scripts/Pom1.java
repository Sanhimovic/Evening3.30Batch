package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//declaration
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(name="pwd")
	private WebElement passWord;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	//initialization
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void unTbox(String un)
	{
		userName.sendKeys(un);
	}
	public void pwdTbox(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}
