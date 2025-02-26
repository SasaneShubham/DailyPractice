package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cssscript.com/demo/filterable-checkable-multi-select/#google_vignette");
		
		driver.manage().window().maximize();
		
		String actText="Volvo";
		driver.findElement(By.xpath("(//div[@class=\"multiselect-dropdown\"])[1]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='multiselect-dropdown-list']/div[4]"));
		
		System.out.println(list.size());
		
	    for(WebElement checkbox:list) {
	    	String expectedText = checkbox.getText();

	    	if(actText.equals(expectedText)) {
	    		checkbox.click();
	    	}
			
	    }
		
	}
}
