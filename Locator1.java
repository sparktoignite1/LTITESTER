package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anilkumarreddy/Documents/chrome driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.findElement(By.id("identifierId")).sendKeys("reddyreddyanil@gmail.com");

	

	}

}
