package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/sarfaraz.ahmad/Desktop/Website/Main.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame("frameOne");

		WebElement nameField = driver.findElement(By.id("name"));
		nameField.sendKeys("Pradeep");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameTwo");
		
		WebElement ageField = driver.findElement(By.id("age"));
		ageField.sendKeys("34");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameOne");
		driver.findElement(By.id("name")).sendKeys("Nailwal");
		
		Thread.sleep(5000);
		driver.close();

	}

}
