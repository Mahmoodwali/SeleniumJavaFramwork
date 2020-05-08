import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromePage {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahmo\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement fa = driver.findElement(By.linkText("Forgot account?"));
		fa.isEnabled();
		fa.click();
					
		driver.navigate().back();
		
		WebElement fbt = driver.findElement(By.linkText("Terms"));
		fbt.isEnabled();
		fbt.click();
		
		
	}
}
