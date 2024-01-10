package example.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/i[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top\"]/d"
				+ "iv[2]/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		firstName.sendKeys("deepak");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		lastName.sendKeys("kumar");
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("dk@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
		
		
		 Thread.sleep(3000);
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
		
		 Thread.sleep(3000);
		 check.click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();

		
		

	}

}
