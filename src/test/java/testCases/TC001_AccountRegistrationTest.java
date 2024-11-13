package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AcoountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass

{
	
	
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Thread.sleep(3000);
		
		AcoountRegistrationPage repage = new AcoountRegistrationPage(driver);
		repage.setFirstName(randomString().toUpperCase());
		repage.setLastName(randomString().toUpperCase());
		repage.setemail(randomString()+"@gmail.com");
		repage.settelephone(randomNumber());
		
		String password = randomAlphaNumberic();
		
		repage.setpassword(password);
		repage.setconfirmpassword(password);
		
		repage.clickCheckBox();
		repage.Continue();
		
	String confmsg = repage.msgconfirmation();
	
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}
	
	public String randomString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomNumber()
	{
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomAlphaNumberic()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return (generatedstring+generatednumber);
	}
}
