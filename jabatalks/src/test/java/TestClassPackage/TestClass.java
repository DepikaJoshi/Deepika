package TestClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.LoginPage;
import Testbrowser.Pojo;


public class TestClass extends Pojo {
	WebDriver driver;
	private LoginPage login;
	private int testID;
	
@BeforeTest
@Parameters("browser")
	public void beforetest(String browser)
	{
	
		if (browser.equalsIgnoreCase("edge"))
		{
			driver=Edge();
		}
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		}

	
@BeforeClass
	
	public void beforeClass1() {
	
		login= new LoginPage(driver);
	}

@BeforeMethod
	
	public void beforeMethod1 () {
	driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
}
	
@Test

   public void  test1() {

	testID = 101;
	
	login.selectdropdown();
	login.language();
	login.languageSelect();
	login.sendfullName();
	login.organizationName();
	login.sendemailId();
	login.tickCheckbox();
	login.hitbutton();
	}

@AfterClass

   public void afterClass1() {
	login=null;
	}

@AfterTest
 
   public void aftertest1()
  {
	driver.close();
	driver= null;
	System.gc();
   }

		
}
	


