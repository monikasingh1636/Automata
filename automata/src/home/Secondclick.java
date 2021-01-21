package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secondclick {

public void Secondclick(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[1]/a")).click();
}
}
