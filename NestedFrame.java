package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/nestedframes");
	driver.switchTo().frame("frame1");
	String text =driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	System.out.println("Text:" +text);
	WebElement element = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(element);
	String text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println("Text1:" +text1);
}
}
