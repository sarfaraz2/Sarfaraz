package com.org.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.get("https://www.imgmodels.com/user");
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("shyam@icreon.com");
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Lion@123");
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	}

}
