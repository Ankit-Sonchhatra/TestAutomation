package tcRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class BasePage {
	
	String path = "C://Users//Akash//workspace//TestAutomation//resource//chromedriver_win32//chromedriver.exe";
	String url = "http://dev.aavgo.com";
	protected WebDriver driver;
	
	@BeforeClass
	public void before() 
	{	
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void after() 
	{	
		driver.quit();
	}
	
	public void timeInterval(int seconds) throws InterruptedException
	{
		Thread.sleep(seconds*1000);
	}
}
