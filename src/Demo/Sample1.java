package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.println("Sadguru Krupa");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/?lang=en-US");
	}
}
