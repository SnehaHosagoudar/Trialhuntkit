package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class pom_script extends Base_page
{
	@FindBy(id="email")
	private WebElement unTbox;
	
	@FindBy(id="pass")
	private WebElement pwdTbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Loginbtn;
	
	public pom_script(WebDriver driver)
	{
		super(driver);
	
	}
	public void setUsername(String un)
	{
		unTbox.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		Loginbtn.click();
	}
}


