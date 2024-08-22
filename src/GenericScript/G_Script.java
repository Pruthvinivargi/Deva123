package GenericScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class G_Script 
{
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
     @AfterMethod
     public void closeappln(ITestResult res)
 {
    if(ITestResult.FAILURE==res.getStatus())
    {
    	Generic_photo.getphoto(driver);
    }
      driver.quit();
	 //driver.close();
 }
	
	}
	
	

