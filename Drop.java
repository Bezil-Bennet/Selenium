package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://shareselenium.herokuapp.com/");
	driver.findElement(By.xpath("//h2[text()='Drop down']")).click();
	//select by index
	WebElement element = driver.findElement(By.id("dropdown1"));
	Select value = new Select(element);
	value.selectByIndex(1);
	//by text
	WebElement element1 = driver.findElement(By.name("dropdown2"));
	Select value1 = new Select(element1);
	value1.selectByVisibleText("Selenium");
	//by value
	WebElement element2 = driver.findElement(By.id("dropdown3"));
	Select value2 = new Select(element2);
	value2.selectByValue("1");
	
	
    //Number of count in dropdown list

    WebElement element3 = driver.findElement(By.className("dropdown"));
    Select value3 = new Select(element3);
    List<WebElement> options = value3.getOptions();
    int size = options.size();
	System.out.println("No. of count:" +size);
	
	//..........sendkeys
	//......multiselect
	
	
	
	
	
	
	
	
}
}
