package Testbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pojo {
	
	public static WebDriver Chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chrome\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver Edge() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver  driver=new EdgeDriver();
		return driver;

}

}
