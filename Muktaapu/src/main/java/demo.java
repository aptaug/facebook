import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https:\\login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https:\\yahoo.com");
		driver.navigate().back();*/
		
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("This is my code");
		driver.findElement(By.name("pw")).sendKeys("123456");
	//	driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
				}

}
