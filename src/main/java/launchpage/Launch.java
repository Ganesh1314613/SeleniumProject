package launchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","F:\\browsers\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  Thread.sleep(2000);
  driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.get("https://opensource-demo.orangehrmlive.com/");
  Thread.sleep(2000);
  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
  Thread.sleep(2000);
  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
  Thread.sleep(2000);
  driver.findElement(By.name("Submit")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
  String e=driver.getTitle();
  System.out.println(e);
  if(e.equalsIgnoreCase("OrangeHRM"))
  {
	  System.out.println("Login page succesfull");
  }
  else
	  System.out.println("FAIL");
  Thread.sleep(5000);
   driver.close();
  
	}

}
