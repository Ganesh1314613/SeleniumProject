package OrangeHrm.OrangeHrm;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	   WebDriver driver;
	      
	 void launch() throws InterruptedException
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter broswer name");
		   String s=sc.next();
		if(s.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","F:\\browsers\\chromedriver.exe");
		  Thread.sleep(2000);
		   driver=new ChromeDriver();

		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		 }
		else if (s.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\browsers\\geckodriver.exe");
			  Thread.sleep(2000);
			   driver=new FirefoxDriver();

			  driver.manage().window().maximize();
			  Thread.sleep(2000);

		}
			
		}
		
	 void close()
	{
		driver.close();
	}

}
