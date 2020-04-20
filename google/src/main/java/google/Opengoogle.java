package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Opengoogle {
	
	@Test
	public void opengoogle() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
