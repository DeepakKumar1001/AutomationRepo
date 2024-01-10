package example.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicCommand {
	public static void main(String[] args) {
		// launching Web Driver
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		
		// opening a url
		// driver.get("https://www.flipkart.com");
		
		
		// opening url using navigate()	;
		
		driver.navigate().to("https://www.flipkart.com/");
		
		// click on weblement
		
//		
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span"));
//element.click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span")).click();
		
		
		
		
	}

}
