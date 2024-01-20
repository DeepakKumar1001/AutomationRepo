package example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement el = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span"));
		el.click();
		
		WebElement el2 = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a"));
		el2.click();
		
		Thread.sleep(5000);
		
		String actualTitle = "Account Login";
		String title = driver.getTitle();
		System.out.println(title);
		
		if(actualTitle.equals(title)) {
			System.out.println("test case is pass");
		}

		
	}

}
