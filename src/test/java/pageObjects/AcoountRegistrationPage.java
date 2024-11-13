package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcoountRegistrationPage extends BasePage {
//constructor
	public AcoountRegistrationPage(WebDriver driver) {
		super(driver);
		}
//locators	

@FindBy	(xpath="//input[@id='input-firstname']")
WebElement txtfirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlastname;


@FindBy (xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txttelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtpassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtconfirmpassword;

@FindBy(xpath="//input[@name='agree']")
WebElement btnagree;

@FindBy(xpath="//input[@value='Continue']")
WebElement Continue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgconfirmation;

//action method


public void setFirstName(String fname) {
txtfirstname.sendKeys(fname);
}

public void setLastName(String lname) {
txtlastname.sendKeys(lname);
}

public void setemail(String email) {
txtemail.sendKeys(email);
}

public void settelephone(String telephone) {
txttelephone.sendKeys(telephone);
}

public void setpassword(String password) {
txtpassword.sendKeys(password);
}

public void setconfirmpassword(String confirmpassword) {
txtconfirmpassword.sendKeys(confirmpassword);
}

public void clickCheckBox() {
	btnagree.click();
}

public void Continue() {
	Continue.click();
}

public String msgconfirmation()
{
	try {
		return(msgconfirmation.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
	
}



}
