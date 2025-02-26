package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mobikwik.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator cls mg mg_icoclose zi2 posabs close-icon-auth mat-icon-button mat-button-base ng-star-inserted\"]")).click();
		
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("9345435343");
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		
	}
}
