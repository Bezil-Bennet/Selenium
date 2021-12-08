package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssi {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Selenium Java");

driver.switchTo().frame("frame3");
driver.findElement(By.id("a")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame("frame2");
Select obj = new Select(driver.findElement(By.id("animals")));
obj.selectByIndex(2);





}

}
