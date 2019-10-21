package seleniumpracticeself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin {

	public static void main(String[] args) {
		int i;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement from = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		from.click();
		driver.findElementByXPath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[2]").click();
		// WebElement To = driver.findElementByXPath("//*[@id=\"toCity\"]");
		// To.click();
		driver.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[3]/label").click();
		for (i = 0; i < 11; i++) {
			driver.findElementByXPath(
					"//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")
					.click();
		}
		driver.findElementByXPath(
				"//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[4]")
				.click();
	//driver.quit();
	}
}