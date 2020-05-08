import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Freecrm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahmo\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		String url = "https://ui.freecrm.com";
		driver.get(url);
				
		String apagetitle = "Cogmento CRM";
		String epagetitle = driver.getTitle();
	
		
		if(epagetitle.equals(apagetitle))
		{
			System.out.println("FreeCRM webpage Launch is PASS");
		}
		else
		{
			System.out.println("FreeCRM webpage Launch is Fail");
		}
		driver.quit();
	}

}
