package PopUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("(//input[@class=\"btn\"])[2]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList <String> ar = new ArrayList<>(ids);
		
		String ChildID = ar.get(1);
		
		driver.switchTo().window(ChildID);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		//System.out.println(ids.size());
		
//		Iterator itr=ids.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		driver.switchTo().window("96F527FF9F9DB62B6F0C0266317AF303");

	}
}
