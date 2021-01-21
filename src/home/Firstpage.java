package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpage {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Surbhi\\eclipse-workspace\\automata\\drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.thesparksfoundationsingapore.org/");
	
	
	
	Thread.sleep(5000);
	

}}


