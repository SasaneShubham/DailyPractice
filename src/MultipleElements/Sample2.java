package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cssscript.com/demo/filterable-checkable-multi-select/#google_vignette");

		driver.manage().window().maximize();


		driver.findElement(By.xpath("(//div[@class=\"multiselect-dropdown\"])[1]")).click();



		List<WebElement> list = driver.findElements(By.xpath("//div[@class='multiselect-dropdown-list']/div"));

		for(int i=3;i<=6;i++) {
			list.get(i).click();
		}
		Thread.sleep(1000);
		driver.quit();
	
}

}