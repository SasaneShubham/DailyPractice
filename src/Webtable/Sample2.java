
package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		driver.manage().window().maximize();
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=6;j++) {
				
				if(i==1) {
					
					String text = driver.findElement(By.xpath("((//table[@class='table table-striped mt-3']//tr)["+i+"]//th)["+j+"]")).getText();
					System.out.print("  "+text);
				}
				else {
					
					String text2 = driver.findElement(By.xpath("((//table[@class='table table-striped mt-3']//tr)["+i+"]//td)["+j+"]")).getText();
					System.out.print("  "+text2);
				}
				
			}
			System.out.println();
		}
	}
}
