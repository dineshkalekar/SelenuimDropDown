package DropdownHandals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmehtod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		
		WebElement e1=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		e1.click();
		
		Select s1=new Select(e1);
		s1.selectByValue("option3");
		
		
//		for(int i=0;i<=3;i++) {
//			
//		}
//		
		
		
		
		
	}

}
