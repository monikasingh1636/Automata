package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scholarship {

public void Scholarship(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[1]/a")).click();
}

}
