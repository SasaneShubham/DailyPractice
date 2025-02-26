package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighClick {

	public static void main(String[] args) {
		
        WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.xpath("(//span[@class='_27h2j1'])[2]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(abc).perform();
		
		act.contextClick().perform();
		
		
		
		
	}
}
