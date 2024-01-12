package example.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		// Select by Visible text.............
//		dropdown.selectByVisibleText("India");
		
		//Select by value..............
		
//		dropdown.selectByValue("IND");
		
		// Select by index............
		
//		dropdown.selectByIndex(87777);

		List<WebElement> drp = dropdown.getOptions();
		
		for(WebElement option : drp) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
			
		}
	}

}
