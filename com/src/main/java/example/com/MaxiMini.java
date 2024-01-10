package example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxiMini {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// minimize and maximize..............
		
		
		
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.get("https://demo.opencart.com/");
		

	}

}
