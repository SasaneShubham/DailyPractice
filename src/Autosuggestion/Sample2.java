package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();

		String extText = "redmi note 14 pro plus";
		driver.get("https://www.google.com/");
		//enter input
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(1000);
		List<WebElement> allOptions =
				driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li//div[@class='eIPGRd']"));
		for(WebElement option:allOptions)
		{
			String list = option.getText();
			if(extText.equals(list)) {
				option.click();
			}
			
			
		}
	}

}

