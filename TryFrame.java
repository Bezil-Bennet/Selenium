package LaunchBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Bezil");
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframeResult");
        String text = driver.findElement(By.id("demo")).getText();
        System.out.println("Text:"+text);
        boolean contains = text.contains("Bezil");
        //contains --->false
        System.out.println(contains);
        
	    if(contains==false) {
			System.out.println("Text didn't have Bezil");
		}
		else {
			System.out.println("Text contains Bezil");
		}
}
}
