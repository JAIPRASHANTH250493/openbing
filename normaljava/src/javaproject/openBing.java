package javaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBing {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bing.com/");
System.out.println("push togithub");
	}

}
