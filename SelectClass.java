package DropdownHandals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	
		WebElement e1=driver.findElement(By.id("drop1"));
		e1.click();
		
		Select a1=new Select(e1);
		
		a1.selectByIndex(0);
		
		for(int i=0;i<=4;i++) {
			a1.selectByIndex(i);
		}
		
	}

}
