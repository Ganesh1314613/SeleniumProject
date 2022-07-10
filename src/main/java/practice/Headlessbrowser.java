package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.interactions.touch.ScrollAction;

public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\browsers\\geckodriver.exe");
		//ChromeOptions op=new ChromeOptions();
		//op.setHeadless(true);
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(5000);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);

		driver.close();

	}

}
