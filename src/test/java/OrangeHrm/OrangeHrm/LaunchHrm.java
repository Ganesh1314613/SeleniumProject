package OrangeHrm.OrangeHrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;

public class LaunchHrm extends Browsers  {

	void loginPage() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  Thread.sleep(2000);
		  //String st=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span")).getText();
		  //System.out.println(st);
		  driver.findElement(By.name("Submit")).click();
		  String e=driver.getTitle();
		  System.out.println(e);
		  if(e.equalsIgnoreCase("OrangeHRM"))
		  {
			  System.out.println("Login page succesfull");
		  }
		  else
			  System.out.println("FAIL");
		  Thread.sleep(5000);
	}
		  
		  void userCreation()throws InterruptedException
			{
				   Thread.sleep(2000);
				   //Actions a=new Actions()

				driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
				Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Aaliyah Haq");
                driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("HelloHRM");
                driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("April2021");
                driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("April2021");
                driver.findElement(By.xpath("//input[@id='btnSave']")).click();
				
			}
		  void employeeCreation() throws InterruptedException
		  {
				driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Quality");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Testing");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='btnSave']")).submit();
				Thread.sleep(2000);
				String wel=driver.findElement(By.xpath("//a[@id='welcome']")).getText();
				System.out.println(wel);
				char cd=wel.toUpperCase().charAt(3);
				System.err.println(cd);
				Thread.sleep(2000);
				
				

		  }
		  
		  void employeeDeletion() throws InterruptedException
		  {
			  driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("0309");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
				Thread.sleep(2000);
				
			  /*driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_80']")).click();
				Thread.sleep(2000);*/
				/*driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
				Thread.sleep(2000);*/
				String table=driver.findElement(By.xpath("//td")).getText();
				System.out.println(table);
				Thread.sleep(2000);
				 
		  }
}

		  	
	
