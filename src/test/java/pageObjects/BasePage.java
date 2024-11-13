package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*EVERY PAGE OBJECT Pacakage SHOULD HAVE BASEPAGECLASS SO THAT PAGEFACTORY METHOD,
WE CAN NOT CALL AGAIN  & AGAIN WE CAN DIRECTLY EXTENDS IT TO EVERY CLASS*/

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
