package home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	

	WebDriver driver;
	String 	driverpath = "C:\\Users\\Surbhi\\eclipse-workspace\\automata\\drivers\\chromedriver.exe";
			
	
  @Test(priority=1)

	  public void click() throws InterruptedException
	  {
	 	  
	 	  Firstclick click =new Firstclick();
	 	  click.Firstclick(driver);
	 	
	 	  System.out.println("case one ");
	 	  Thread.sleep(5000);
	  }
  
	  @Test (priority=2)
	  public void click2() throws InterruptedException
	  {
		  Secondclick click2= new Secondclick();
		  click2.Secondclick(driver);
		  System.out.println("case two");
		  Thread.sleep(2000);
	  }
	  @Test (priority=3)
	  public void click3() throws InterruptedException
	  {
		  Thirdclick click3= new Thirdclick();  
		  click3.Thridclick(driver);
		  System.out.println("case three");
		  Thread.sleep(5000);
		  
	  }
	  
	  @Test (priority=4)
	  public void click4() throws InterruptedException
	  {
		  Policy click4= new Policy();
		  click4.Policy(driver);
		  System.out.println("case four");
		  Thread.sleep(2000);
		  
	  }
	  
	  @Test ( priority=5)
	  public void click5()
	  {
		  Scholarship click5= new Scholarship();
		  click5.Scholarship(driver);
		  
		 
	  }
  
	  @Test (priority=6)
	  public void click6() throws InterruptedException
	  {
		  Sosclick click6= new Sosclick();
		  click6.Sosclick(driver);
		  Thread.sleep(5000);
		  System.out.println("done");
		  
	  }
	  
	  
	  @Test (priority=7)
	  public void click7()
	  {
		  
		  Joinus click7= new Joinus();
		  click7.Joinus(driver);
		  
		  
	  }
	  
	  @Test (priority=8)
	  public void Student() throws InterruptedException
	  {
		  
		  Student click8= new Student();
		  click8.Student(driver);
		  Thread.sleep(2000);
	  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  driver =new ChromeDriver();
	  driver.get("https://www.thesparksfoundationsingapore.org/");
	  driver.manage().window().maximize();
	  System.out.println("launched");
	  
	  Thread.sleep(2000);
	  //	/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);*/
  		
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
