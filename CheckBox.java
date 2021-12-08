package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://shareselenium.herokuapp.com/");
	driver.findElement(By.xpath("//h2[text()='Checkbox']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
boolean value = driver.findElement(By.xpath("//input[@type='checkbox'][6]")).isSelected();
if(value) {
	System.out.println("Not selected");
}
	else {
		System.out.println("Confirmed - selected");
	}
//..........deselect
driver.findElement(By.xpath("//input[@type='checkbox'][8]"));






}
}

