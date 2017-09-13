package tcRepo;

import org.testng.annotations.Test;

import pageObject.FirstObject;

public class FirstTest extends BasePage {

	String uname = "ledoh@mobilevpn.top";
	String pwd = "1234";
	String msg="Hello This is for Automation Testing";
	
	@Test
	public void scenario() throws InterruptedException {

		FirstObject firstObject=new FirstObject(driver);
		
		firstObject.doLogin(uname, pwd);
		
		firstObject.gotoChatOption();
		
		firstObject.clickOnHouseKeeping();
		
		firstObject.sendMessage(msg);
		
	}
}
