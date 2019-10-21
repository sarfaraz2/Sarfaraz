package com.org.main;

import java.lang.reflect.Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.in");		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Samsung");
		
		WebElement searchBtn = driver.findElement(By.xpath("nav-input"));
		
		
		searchBtn.click();
		

		
		/*driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("mukesh");
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("62bR8kW1VQru");
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	*/
	}

}
