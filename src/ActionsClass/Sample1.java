package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		
		act.moveToElement(login).perform();
		
		driver.findElement(By.xpath(("(//div[@class=\"_3pKU-e\"])[6]"))).click();
		
		
		
		
	}
}
