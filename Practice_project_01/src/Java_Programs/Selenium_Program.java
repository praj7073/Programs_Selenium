package Java_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		// System.out.println("Hii");
		driver.get("https://www.google.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}