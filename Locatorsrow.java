package com.uiElemints;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsrow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anilkumarreddy/Documents/chrome driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> columnHeadings=driver. findElements(By. cssSelector("table.dataTable›thead›tr>th"));
				//columns
		for (WebElement w :
				columnHeadings)
				System.out.println(w.getText());
				System.out.println( "Number of columns are	"+columnHeadings.size());
				//RoWs
				List<WebElement> rows=driver.findElements
				(By.cssSelector ("table.dataTable»tbody>tr")) ;
				System.out.println( "Number of rows are"+rows.size());
				//for (WebElement w:rows)
				//System.out.println(w.getText());
			
		
		//list for company names 
				
			String exp="KSB";
				List<WebElement> cNames=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
				
				for (int i=0;i<cNames.size();i++) {
				if (cNames.get(i).getText().equalsIgnoreCase(exp))
				{
				System.out.println("Company found at"+(i+1)+"position");
				System.out.println(driver. findElement (By.xpath
				("//table[@class='dataTable' ]/tbody/tr["+(i+1)+"]")). getText ());
				}
				}
			
	

}
}