package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_Script 
{
	//declaration
	  @FindBy(id="email")
	  private WebElement Uname;
	  
	  @FindBy(id="pass")
	  private WebElement Pname;
	  
	  @FindBy(name="login")
	  private WebElement Lbutton;
	  
	  //Initialization
	  public P_Script(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	   }
	  
	  //utilization
	  public void passData1(String un)
	  {
		  Uname.sendKeys(un);
		 
		  Lbutton.click();
	  }
	  public void passData11(String pwd)
	  {
		  Pname.sendKeys(pwd);
	  }

}
