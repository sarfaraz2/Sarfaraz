package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement departLink = driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		departLink.click();
		
		

		WebElement monYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));

		String expMonYear = "August 2020";

		WebElement nextBtn = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

		while (!monYear.getText().equals(expMonYear)) {
			nextBtn.click();
		}

		String expDay = "23";
		
		String dayXpath = "//div[@class='dateInnerCell']/p[text()=" + expDay + "]";
		driver.findElement(By.xpath(dayXpath)).click();
		/*List<WebElement> days = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p"));
		Iterator<WebElement> daysItr = days.iterator();
		while (daysItr.hasNext()) {
			WebElement currDay = daysItr.next();
			if (currDay.getText().equals(expDay)) {
				currDay.click();
				break;
			}
		}*/

	}

}
