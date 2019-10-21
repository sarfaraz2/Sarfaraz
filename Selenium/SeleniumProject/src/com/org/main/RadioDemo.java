package com.org.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		if(male.isSelected()) {
			
		}else {
			male.click();
		}*/
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(day);
		dayDropdown.selectByVisibleText("24");
		
		

	}

}
