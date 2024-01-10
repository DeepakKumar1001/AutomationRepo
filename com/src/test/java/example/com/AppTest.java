package example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
  public static void main(String[] args) {
	  //launching browser
	WebDriver driver = new ChromeDriver();
	driver.get("https://leetcode.com");
	
	
	} 
}
