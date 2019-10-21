package com.org.main.dz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Browsewopenclose {
	static WebDriver driver;

@BeforeMethod
public void openbrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://davidzwirner.com/user");
Thread.sleep(3000);
	}


@AfterMethod
public void closebrowser() {
driver.close();
	}

}
