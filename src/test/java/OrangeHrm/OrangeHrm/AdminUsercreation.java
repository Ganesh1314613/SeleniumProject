package OrangeHrm.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class AdminUsercreation extends Browsers  {

	void userCreation() throws InterruptedException
	{
		   Thread.sleep(2000);
		   //Actions a=new Actions()

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
		
	}
	
	}


