package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_class {
	public static WebDriver driver;

	
	public static WebDriver getDriver(String browser) {//string browser=parameter
		try {
			if (browser.equalsIgnoreCase("chrome")) {//if the browser name is equal to chrome it should go inside
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+("\\Driver\\firefoxdriver.exe"));
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+("\\Driver\\msedgedriver.exe"));
				driver = new EdgeDriver();
			}

			else {
					System.out.println("Invalid Brower");
				 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	driver.manage().window().maximize();
	return driver;
	}
	
	public static void getUrl(String path) {
	   driver.get(path);
	}
    public static void sendkeys(WebElement element, String value) {
       element.sendKeys(value);
            
}
    public static void inputValueElement(WebElement element,String value) {
	element.sendKeys(value);
}
    
    public static void ClickOnElement(WebElement element) {
    	element.click();
   	}
   
    public static void close() {
	driver.close();
    }
	public static void navigate(String path) {
	driver.navigate().to(path);
	}
    public static void currentUrl() {
    driver.getCurrentUrl();	
}
    public static void forward() {
	driver.navigate().forward();
	}
    public static void backward() {
	driver.navigate().back();
    }
    public static void refresh() {
	driver.navigate().refresh();
}
    public static void navigateTo(String url) {
	driver.navigate().to(url);
}
    public void elementClear(WebElement element) {
	element.clear();
}
    public static void windowsHandles() {
	Set<String> element = driver.getWindowHandles();
	for (String st : element) {
		String title = driver.switchTo().window(st).getTitle();
		System.out.println(title);
	}
	}
	public static void robotclass() throws Throwable {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
		
	
    public static void actionMethod(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick(element).build().perform();
	
}	
	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}


}

	





