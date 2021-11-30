package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr =new ChromeDriver();
		//maximize screen
		dr.manage().window().maximize();
		//download URL
		dr.get("https://www.amazon.in/");
		//step 1:find web element - drop down
		WebElement findEle = dr.findElement(By.id("searchDropdownBox"));
		//step2: pass webelement to select class
		Select down = new Select(findEle);
		//step 3: 3 methods
		//1)Random drop down selection
		down.selectByIndex(2);
		//2)when a multilingual language
		//down.deselectByValue(null);
		//3)when not a multilingual language
		//down.selectByVisibleText(null);
		
		
		
		
	}

}
