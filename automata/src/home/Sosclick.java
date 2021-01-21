package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sosclick {

public void Sosclick(WebDriver driver)
{
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[3]/a")).click();
}

}
