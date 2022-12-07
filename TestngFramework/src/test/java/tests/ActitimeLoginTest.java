package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import core.Base;
import pageObj.ActitimeLoginPage;

public class ActitimeLoginTest extends Base{
	
	ActitimeLoginPage acti;
	
	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("Broswer opened successfully");
	}

	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("Broswer Closed");
	}
	
	@Test(enabled = true)
	@Parameters({ "userName", "password" })
	public void loginToHotelTestOne(String userName, String password) {
		acti = new ActitimeLoginPage();
		
		acti.singInToActitime(userName, password);


	}

}
