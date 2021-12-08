package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement FinEle = driver.findElement(By.id("Skills"));
	Select skill = new Select(FinEle);
	skill.selectByVisibleText("Java");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bezil");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Bennet");
	//never use number in xpath
	//driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Ambatur");
	
	driver.findElement(By.tagName("textarea")).sendKeys("Avadi");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bezil@gmail.com");
	driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	
	
	WebElement element = driver.findElement(By.id("msdd"));
	element.click();
	driver.findElement(By.linkText("English")).click();
	
	
	Select yr = new Select(driver.findElement(By.id("yearbox")));
	yr.selectByVisibleText("1997");
	Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	month.selectByVisibleText("June");
	Select day = new Select(driver.findElement(By.id("daybox")));
	day.selectByValue("13");
	
	//select country
	//Select country = new Select(driver.findElement(By.xpath("//span[@role='combobox']")));
	//country.selectByIndex(5);
	//Select country = new Select (drdw.findElement(By.id("select2-country-container")));
  	//country.selectByIndex(5);
	
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9751581235");
    driver.findElement(By.id("firstpassword")).sendKeys("BeZiL32");
    driver.findElement(By.id("secondpassword")).sendKeys("BeZiL32");
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
