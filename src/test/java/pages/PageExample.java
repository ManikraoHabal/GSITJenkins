package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageExample {

	WebDriver driver;

	By inputBox = By.id("input_text");

	public PageExample(WebDriver driver)

	{

		this.driver = driver;

	}

	public WebElement getInputBox()

	{

		return driver.findElement(inputBox);

	}

}
