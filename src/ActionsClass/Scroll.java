package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.scrollByAmount(0, 200).perform();
		
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		act.moveToElement(career).click().perform();
		
		Thread.sleep(2000);
		
		act.scrollByAmount(0, 10000).perform();
		
		act.scrollByAmount(0, -10000).perform();
		
	}
}
