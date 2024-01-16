package example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		
		WebElement fromElement2 = driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		
		WebElement toElement = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		
		
		// drag and drop using method of Actions dragAndDrop()
//		
		Actions action = new Actions(driver);
		action.dragAndDrop(fromElement2, toElement).build().perform();
//	
		
		// Second Method of drag and drop with using four method like : clickAndHold() ,moveToElement() , release(), build(), perform();
//		
//		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
//		
		
		
		
	}

}
