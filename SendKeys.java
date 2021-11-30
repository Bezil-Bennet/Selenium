package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.launcher.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://shareselenium.herokuapp.com/");
	driver.findElement(By.className("wp-categories-title")).click();
	driver.findElement(By.id("email")).sendKeys("bezil@34");
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("New Word",Keys.TAB);
	String text = driver.findElement(By.xpath("//input[@value='ShareSelenium']")).getAttribute("value");
	System.out.println("Attribute:" +text);
	String text1 = driver.findElement(By.xpath("//label[@for='uname']")).getText();
	System.out.println("Value:" +text1);
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	boolean value = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	//value=false==>enabled	`
	if (value) {
		System.out.println("Enabled");
	}
	else {
		System.out.println("Disabled");
	}
		

		
	
	
}


}
