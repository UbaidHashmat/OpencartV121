package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os , String br)
	{
		
		switch(br.toLowerCase())
		{
		case "chrome" :	driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;	
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser name..."); return;
		}
		
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}

}
