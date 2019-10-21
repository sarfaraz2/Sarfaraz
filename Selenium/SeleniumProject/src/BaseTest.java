import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	static WebDriver driver;

	@BeforeTest
	@Parameters("browserType")
	public void openBrowser(String browserType) throws InterruptedException {
		if (browserType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserType.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(
				"file:///D:/Sarfaraz_Selenium/Selenium/Selenium%20Tutorial/WebSite_Window%20handler/WebSite/Pradeep.html");

		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
