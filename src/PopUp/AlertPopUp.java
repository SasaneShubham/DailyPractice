package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("32322");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String text = alt.getText();
		
		System.out.println(text);
		
		alt.accept();
		//alt.dismiss();
		
		String text2 = alt.getText();
		
		System.out.println(text2);
		
	
		
		
	}
}
