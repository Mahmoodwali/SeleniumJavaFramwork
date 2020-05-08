import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanos\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		String url = "https://www.orbitz.com";
		driver.get(url);
		
		String orpagetitle = "Orbitz Flights, Cheap Vacations, Rental Cars & Hotel Deals"; 
		String expagetitle = driver.getTitle();
	
		if(expagetitle.equals(orpagetitle))
		{
			System.out.println("Orbitz page Launch is PASS");
		}
		else
		{
			System.out.println("Orbitz page Launch is FAIL");
		}
		
		WebElement joinrewards = driver.findElement(By.id("rewardsHeader"));
		joinrewards.click();
		

		
		String browserTabs = driver.getWindowHandle();
		System.out.println("Current window - " +browserTabs);
		driver.switchTo().window(browserTabs);
		
		
		/*if(expagetitle.equals(orpagetitle))
		{
			System.out.println("Orbitz page Launch is PASS");
		}
		else
		{
			System.out.println("Orbitz page Launch is FAIL");
		}
		//WebElement orlogo = driver.findElement(By.cssSelector("button[#u_0_13][type=submit][class=_6j mvm _6wk _6wl _58mi _3ma _6o _6v][name=websubmit]"));
	*/
	}

}
