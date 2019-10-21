package com.org.main;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActionsDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		TakesScreenshot tsh = (TakesScreenshot)driver;
		File source = tsh.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\sarfaraz.ahmad\\Desktop\\Priya.png");
		Files.copy(source, target);
		/*Actions action = new Actions(driver);
		
		WebElement check = driver.findElement(By.xpath("//span[text()='Check-In']"));
		action.contextClick(check).build().perform();
		action.keyDown(Keys.ARROW_DOWN);*/
		

	}

}
