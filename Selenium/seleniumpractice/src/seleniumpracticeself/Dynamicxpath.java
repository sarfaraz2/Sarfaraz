package seleniumpracticeself;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args){
		String Day= "29";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarfaraz.ahmad\\Desktop\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String Expdate= "August 2020";
	WebElement MonYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
	WebElement nextbtn= driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
	//while(!MonYear.getText().equals(Expdate)) {
		while(!Expdate.equals(MonYear.getText())) {
		
		nextbtn.click();
		
	}
	
	String Dayxpath = "//div[@class='dateInnerCell']/p[text()="+Day+"]";
	driver.findElement(By.xpath(Dayxpath)).click();
	
	String Print = "System.out.println(driver.getTitle())";
	String Pagetitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday";
	if(Print.equals(Pagetitle)){
		System.out.println("Page Title mapped");
		}
	
	else {
		System.out.println("Page Title not mapped");
	}
	
	
	}
}

