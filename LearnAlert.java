package LaunchBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://shareselenium.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h2[text()='Alert']")).click();
	//Alert --->Interface
	//2 types--->Nonmodal and modal dialogue
	
	//Modal Alerts
	
	//1)Simple Alert---> only OK button
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	//switch the control from mainpage to alert box
	Alert alert = driver.switchTo().alert();
	//single switchTo() is enough
	alert.accept();
	
	//2)confirmation alert----->OK and Cancel
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
    //Thread.sleep(3000);
	alert.accept();
	
	//3)Prompt Alert------->Ok,Cancel and Text box
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	alert.sendKeys("Selenium Java");
	String text = alert.getText();
	System.out.println("Prompt Alert:" +text);
    alert.dismiss();
    
	
	

	
}
}
