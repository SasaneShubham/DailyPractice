package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Shopify/");
		
		driver.manage().window().maximize();
		
		//sendkeys
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shubham");//xpath by attribute
		
		driver.findElement(By.id("lastname")).sendKeys("Sasane");     //id as locator
		
		driver.findElement(By.name("usrnm")).sendKeys("ShubhSasane"); //name as locator
		
		//click
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();  //xpath by index
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shubh@1233");
		
		//isSelected 
		boolean selected = driver.findElement(By.xpath(("(//input[@type='radio'])[2]"))).isSelected();
		
		System.out.println(selected);
		
		if(selected==true) {
			System.out.println("Is Selected");
		}
		else {
			System.out.println("Not selected");
		}
		
		//getText
		String text = driver.findElement(By.xpath("//td[text()='SivaKumar']")).getText();
		
		System.out.println("text: "+ text);
		
		//isEnabled
		boolean enable = driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).isEnabled();
		
		System.out.println("Enable:" + enable);
		
		if(enable==true) {
			System.out.println("Is Enable");
		}
		else {
			System.out.println("Is not Enable");
		}
		
		//isDisplayed
		boolean displayed = driver.findElement(By.xpath("//h2[text()='Register Form']")).isDisplayed();		
		
		System.out.println("Is Displayed: " +displayed);
		
		if(displayed==true) {
			System.out.println("Is Displayed");
		}
		else {
			System.out.println("Not displayed");
		}
		
		Thread.sleep(3000);
		WebElement abc = driver.findElement(By.xpath("//select[@id='selectcity']"));
		
		Select s=new Select(abc);
		
		//s.selectByIndex(1);
		//s.selectByValue("Coimbatore");
		s.selectByVisibleText("Chennai");
		
		
		
	}
}
