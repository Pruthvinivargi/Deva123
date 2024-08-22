package runnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericScript.G_Script;
import POMScript.P_Script;


public class R_script extends G_Script
{
	@Test
	public void loginpage()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		P_Script p=new P_Script(driver);
		p.passData1("admin");
		p.passData1("pru123");
		Assert.fail();
		
	}

}
