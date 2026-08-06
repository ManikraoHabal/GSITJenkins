package GSITJenkins.GSITJenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PageExample;

public class ElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.engineerdiaries.com/selenium");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		PageExample page=new PageExample(driver);
		
		
		page.getInputBox().clear();
		page.getInputBox().sendKeys("Hello");
		
	}

}
