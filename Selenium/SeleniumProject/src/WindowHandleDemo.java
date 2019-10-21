import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/sarfaraz.ahmad/Desktop/WebSite/WebSite/Pradeep.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("BBBB");;
		driver.findElement(By.linkText("Go Mohan")).click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		String secondWindow = "";
		
		for(String currWindow : allWindow) {
			System.out.println(currWindow);
			if(!currWindow.equals(mainWindow)) {
				secondWindow = currWindow;
			}
		}
		
		driver.switchTo().window(secondWindow);
		driver.findElement(By.id("pass")).sendKeys("AAAA");
		

	}

}
