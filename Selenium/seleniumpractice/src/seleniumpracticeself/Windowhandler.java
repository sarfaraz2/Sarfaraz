package seleniumpracticeself;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.davidzwirner.com/");
		driver.findElementByLinkText("Load more news").click();

		WebElement element = driver.findElement(By.xpath(
				"//div[@class='slide--title']/a[@href='https://www.davidzwirner.com/news/listening-threads-anni-albers']"));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// Code for Child Window handler using while loop iterator

		String mainwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();

		// Window handler using iterator
		Iterator<String> itr = allwindow.iterator();
		while (itr.hasNext()) {
			String Childwindow = itr.next();
			if (!mainwindow.equals(Childwindow)) {
				driver.switchTo().window(Childwindow);

			}

		}

		WebElement secondclick = driver.findElement(By.xpath("//em[text()='Vanity Fair']"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", secondclick);

		/*
		 * String Secondwindow = "";
		 * 
		 * for (String currWindow : allwindow) { System.out.println(currWindow); if
		 * (!currWindow.equals(mainwindow)) { Secondwindow = currWindow; } }
		 * 
		 * driver.switchTo().window((Secondwindow));
		 * System.out.println(driver.getTitle()); WebElement secondclick =
		 * driver.findElement(By.xpath("//em[text()='Vanity Fair']"));
		 * JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		 * executor1.executeScript("arguments[0].click();", secondclick);
		 */

	}

}
