package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
				
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("iframeResult");
	    
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().parentFrame();
	   // driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}
