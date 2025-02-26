package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		driver.manage().window().maximize();
		
		int row = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr")).size();
		
		System.out.println("No.of rows: "+row);
		
		int col = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//th")).size();
		
		System.out.println("No of columns: "+col);
		
		String abc = driver.findElement(By.xpath("((//table[@class='table table-striped mt-3']//tr)[4]//td)[4]")).getText();
		
		System.out.println(abc);
	}
}
