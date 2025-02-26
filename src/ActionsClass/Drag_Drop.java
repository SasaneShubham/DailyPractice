package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		WebElement src = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		
		//(//a[@class='button button-orange'])[5]
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		
		
		Actions act1=new Actions(driver);
		
		act.dragAndDrop(src1, dest1).perform();
		
		
		
		//
		
        WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		
		Actions act2=new Actions(driver);
		
		act.dragAndDrop(src2, dest2).perform();
		
	
		//
		
        WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		
		Actions act3=new Actions(driver);
		
		act.dragAndDrop(src3, dest3).perform();
		
		
		
		
		
		
		
		
	}
}
