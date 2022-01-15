package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Base_page;
import generic.Generic_read_excel;
import pom.pom_script;


public class Test_script extends Base_Test
{
	@Test
	public void getlogged()
	{
		String uname=Generic_read_excel.getData("Sheet1", 0, 0);
		String pwd=Generic_read_excel.getData("Sheet1", 0, 1);
		pom_script fb=new pom_script(driver);
		fb.setUsername(uname);
		fb.setPassword(pwd);
		fb.clicklogin();
		
	}
	
	
	

}



