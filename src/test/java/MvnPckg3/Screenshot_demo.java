package MvnPckg3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot_demo {

	@Test
	public void testOmayo() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		
		//Screenshot1
		
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1, new File("screenshots\\screenshot1.jpg"));
		
		driver.findElement(By.linkText("compendiumdev")).click();
		
		//Screenshot2
		
		File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile2, new File("screenshots\\screenshot2.jpg"));
				
		
	}
}
