package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
@Test
public void Testcase1()
{
	//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--no-sandbox");

	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.get("http://3.19.255.165:8080/DevOps/");
	String actual="Calculator for DevOps";
	String expected=driver.getTitle();
	Assert.assertEquals(actual, expected);//.assertEquals(, title );
	System.out.println("Testcases passed");
	
}
}
