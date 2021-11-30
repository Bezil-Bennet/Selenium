package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriverManager.edgedriver().setup();
	//launch browser
	ChromeDriver obj = new ChromeDriver();
	//launch URL
	//obj.get("https://www.google.com/");
	obj.navigate().refresh();
	//title of page
	System.out.println(obj.getTitle());
	System.out.println(obj.getCurrentUrl());
	
	//close page
	obj.close();
	
	
	
	
	
	
	
	
}
}
