package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("redmi");
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li[6]//div[@class='eIPGRd']"));
		
        for(WebElement options:list) {
        	System.out.println(options.getText());
        }
		
	}
}
