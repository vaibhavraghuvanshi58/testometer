package sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 {
public static void main(String[] args) {
	// Selenium API  - done
	// WebDriver - done
	
	
	// Step 1 - Configuring webdriver
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\git\\testometer\\driver\\chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vaibhav\\git\\testometer\\driver\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Vaibhav\\git\\testometer\\driver\\msedgedriver.exe");
	
	/*
	 * Properties for various driver
	 * chrome = webdriver.chrome.driver
	 * mozilla = webdriver.gecko.driver
	 * ie = webdriver.ie.driver
	 * edge = webdriver.edge.driver
	 */
	
	// Step 2 - Creating Browser Object
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("https://www.google.com"); //  get method is to open url
	driver.manage().window().maximize(); // maximize browser
	
	// Locating elements
	// id , name, class, tag, linktext, partiallinktext, xpath, cssselector
	By searchText = By.name("q");
	WebElement e1 = driver.findElement(searchText);
	e1.sendKeys("sachin");
	e1.sendKeys(Keys.ENTER);

	
	driver.findElement(By.partialLinkText("Sachin Tendulkar - Wikipedia")).click();
	
	
	
	
	
//	driver.close(); // close active browser
	
	
	
	
	
	
	
}
}
