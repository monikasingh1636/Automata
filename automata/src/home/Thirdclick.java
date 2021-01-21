package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thirdclick {

public void Thridclick(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).click();
}

}