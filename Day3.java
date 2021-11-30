package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	//launch browser
	ChromeDriver drive = new ChromeDriver();
	//URL download
	drive.get("https://phptravels.org/index.php?rp=/login");
	//maximize screen
	drive.manage().window().maximize();
	//locate element
	drive.findElement(By.id("inputEmail")).sendKeys("bezilbennet@gmail.com");
	drive.findElement(By.id("inputPassword")).sendKeys("Password");
	drive.findElement(By.id("login")).click();
	drive.findElement(By.linkText("Register")).click();
	drive.findElement(By.id("inputFirstName")).sendKeys("Bezil");
	drive.findElement(By.id("inputLastName")).sendKeys("Bennet");
	drive.findElement(By.id("inputEmail")).sendKeys("bezilbennet@gmail.com");
	
	//drive.findElement(By.className("selected-dial-code"));
	//Select dial=new Select (drive.findElement(By.className("selected-dial-code")));
	//dial.selectByVisibleText("India");
	
	drive.findElement(By.id("inputPhone")).sendKeys("9751581235");
	drive.findElement(By.id("inputCompanyName")).sendKeys("Selenium");
	drive.findElement(By.id("inputAddress1")).sendKeys("No.1, cross street");
	drive.findElement(By.id("inputAddress2")).sendKeys("Avadi");
	drive.findElement(By.id("inputCity")).sendKeys("Chennai");
	drive.findElement(By.id("stateinput")).sendKeys("Tamil Nadu");
	drive.findElement(By.id("inputPostcode")).sendKeys("621713");
	
	//drive.findElement(By.id("inputCountry"));
	//Select obj = new Select(drive.findElement(By.id("inputCountry")));
	//obj.selectByValue("IN");
	
	drive.findElement(By.id("customfield2")).sendKeys("9751581235");
	drive.findElement(By.id("inputNewPassword1")).sendKeys("12Pb@");
	drive.findElement(By.id("inputNewPassword2")).sendKeys("12Pb@");
	/*
	 * drive.findElement(By.
	 * className("bootstrap-switch-handle-off bootstrap-switch-default")); Select
	 * sel = new Select(drive.findElement(By.
	 * className("bootstrap-switch-handle-off bootstrap-switch-default")));
	 * sel.selectByVisibleText("Yes");
	 */
	
	
	
	
	
	
	
	
	
	
	
		
	
}
}
