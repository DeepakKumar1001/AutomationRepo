package example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/iframe");
			
			driver.switchTo().frame("mce_0_ifr");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();
			driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("rakesh");
			

	}

}
