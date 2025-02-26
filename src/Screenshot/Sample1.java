package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample1 {



	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver =new ChromeDriver();

		driver.get("https://demoqa.com/nestedframes");

		driver.manage().window().maximize();


		String RS = RandomString.make(3);
		
		//String RS = RandomString.make(5);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    	File f=new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Photo\\"+RS+".JPEG");

		FileHandler.copy(src, f);

	}
}
