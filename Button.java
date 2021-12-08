package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://shareselenium.herokuapp.com/");
	driver.findElement(By.xpath("//h2[text()='Button']")).click();
	driver.findElement(By.id("home")).click();
	driver.findElement(By.xpath("//h2[text()='Button']")).click();
	//get colour........
	String colour = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color");
	System.out.println("Colour:" +colour);
	Dimension size = driver.findElement(By.id("size")).getSize();
	System.out.println("Dimension:"+size);
	
	
}
}
