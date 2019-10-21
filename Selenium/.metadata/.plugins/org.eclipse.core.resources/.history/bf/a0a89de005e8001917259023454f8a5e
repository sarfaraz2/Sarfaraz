import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[4]/div/div[1]/div[1]/div[2]/div/ul/li[4]/span/div/div[1]/a/img"));
		
		jse.executeScript("arguments[0].scrollIntoView();", element);

	}

}
