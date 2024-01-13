package example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		userName.sendKeys("selenium");
		userName.sendKeys(Keys.RETURN);
		
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
		action.contextClick(searchBox).perform();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(30000);
		driver.quit();
		
		//driver.quit();

	}

}
