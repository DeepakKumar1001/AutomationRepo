package example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencard {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	
	// find web element
	
	WebElement account = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span"));
	account.click();
	
	WebElement register = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a"));
	
	register.click();
	
	WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
	firstName.sendKeys("rakesh ");
	WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
	lastName.sendKeys("Mishra");
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	email.sendKeys("rakesh@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	password.sendKeys("12568754");
	firstName.clear();
	
	String st = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
	System.out.println(st);
	
//	
//	WebElement cheeckbtn = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
//	cheeckbtn.click();
//	
//	WebElement countinue = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
//			countinue.click();
	// navigate back
	driver.navigate().back();
	// navigate forword 
	driver.navigate().forward();
	
	
	//refresh 
//	driver.navigate().refresh();
	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	//close the browser
	driver.close();
	
	}

}
