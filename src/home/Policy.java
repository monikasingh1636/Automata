package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Policy {

public void Policy(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a")).click();
}

}
