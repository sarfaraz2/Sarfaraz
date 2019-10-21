import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngGogo extends BaseTest{
	
	@Test
	public void acheckUserNameExist() throws InterruptedException {		
		String result = "Pass";
		try {
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Mohan");
		} catch(Exception e) {
			result = "Fail";
		}
		System.out.println(result);
		Thread.sleep(3000);
	}
	
	@Test
	public void bcheckGoMohanLinkExist() {
		//String result = "Pass";
		driver.findElement(By.linkText("Go Mohan")).click();
		//System.out.println(result);
	}

}
