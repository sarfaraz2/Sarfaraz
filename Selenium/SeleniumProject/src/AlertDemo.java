import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/sarfaraz.ahmad/Desktop/WebSite/WebSite/UserRegistration.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Register")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();

	}

}
