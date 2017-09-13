package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import tcRepo.BasePage;

public class FirstObject extends BasePage{
  
	public By userName = By.id("username"); 
	public By passWord = By.id("userpass"); 
	public By loginBtn = By.xpath(".//*[@id='loginForm']//button[normalize-space(text())='Log in']"); 
	
	public By chatTab = By.xpath(".//*[@id='sidebar-scroll']//li//a/span[normalize-space(text())='Chat']");
	public By houseKeepingTab = By.xpath(".//*[@id='chatWindow']//li[starts-with(@class,'chatRoomList')]//span[normalize-space(text())='Housekeeping']");
	public By roomNumber = By.xpath(".//*[@id='chatWindow']//div[@class='left roomListUl']//span[starts-with(@class,'roomName') and normalize-space(text())='Room: 2']");
	
	public By chatBox = By.id("chat");
			
	public FirstObject(WebDriver driver)
	{
		this.driver = driver;
	}
	public void doLogin(String username,String password) throws InterruptedException 
	{
		driver.findElement(userName).sendKeys(username);
		timeInterval(1);
		driver.findElement(passWord).sendKeys(password);
		timeInterval(1);
		driver.findElement(loginBtn).click();
	}
	
	public void gotoChatOption() throws InterruptedException
	{
		timeInterval(2);
		driver.findElement(chatTab).click();
	}
	
	public void clickOnHouseKeeping() throws InterruptedException
	{
		timeInterval(5);
		driver.findElement(houseKeepingTab).click();
	}
	
	public void gotoRoom() throws InterruptedException
	{
		timeInterval(2);
		driver.findElement(roomNumber).click();
	}
	
	public void sendMessage(String msg) throws InterruptedException
	{		
		timeInterval(2);
		driver.findElement(chatBox).sendKeys(msg);
		timeInterval(1);
		driver.findElement(chatBox).sendKeys(Keys.ENTER);
	}
}
