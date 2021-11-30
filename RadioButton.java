package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shareselenium.herokuapp.com/");
		driver.findElement(By.xpath("//h2[text()='Radio Button']")).click();
		driver.findElement(By.id("yes")).click();
		boolean value = driver.findElement(By.name("news")).isSelected();
		//value==>false==>selected
		if(value) {
			System.out.println("Not selected");
		}
		else {
			System.out.println("Selected");
		}
		boolean value1 = driver.findElement(By.name("age")).isSelected();
		if(value1) {
			driver.findElement(By.name("age")).click();
			System.out.println("Click");
		}
		else {
			System.out.println("Already clicked");
		}
		
	}

}
