package DynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//String rating = driver.findElement(By.xpath("((//div[@class='cPHDOP col-12-12'])[3]//span)[4]")).getText();
		
		//((//div[@class="_75nlfW"])[12]//span)[6]
		String rating = driver.findElement(By.xpath("((//div[@class='_75nlfW'])[11]//span)[4]")).getText();
		
		System.out.println(rating);
	}
}
