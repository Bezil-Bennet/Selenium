package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LernFrame {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/frames");
driver.switchTo().frame("frame1");
String text = driver.findElement(By.id("sampleHeading")).getText();
System.out.println(text);
//driver.switchTo().defaultContent();//out of frame

//frame2
driver.switchTo().frame("frame2");
String text2 = driver.findElement(By.id("sampleHeading")).getText();
System.out.println(text2);

}
}
