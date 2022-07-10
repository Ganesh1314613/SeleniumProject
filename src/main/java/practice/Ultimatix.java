package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ultimatix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		WebElement dr=driver.findElement(By.xpath("//select[@id='first']"));
		Select sel=new Select(dr);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("Google");
		Thread.sleep(2000);
		sel.selectByVisibleText("Iphone");
		Thread.sleep(2000);
		WebElement db=driver.findElement(By.xpath("//select[@id='second']"));
		Select sec=new Select(db);
		Thread.sleep(2000);
		sec.selectByIndex(0);
		Thread.sleep(2000);
		sec.selectByValue("donut");
		Thread.sleep(5000);
		sec.deselectAll();
		driver.close();

	}

}
