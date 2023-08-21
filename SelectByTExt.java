package DropdownHandals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByTExt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		
		WebElement e1=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		e1.click();
		
		Select s1=new Select(e1);
		List<WebElement> list=s1.getOptions();
		int size=list.size();
		
		System.out.println(size);
		for(int i=0;i<size;i++) {
			
			s1.selectByIndex(i);
			WebElement d1=list.get(2);
			String GetList=d1.getText();
			System.out.println(GetList);		
		}
		
	//	s1.selectByVisibleText("Option3")
		
//		s1.deselectByIndex(3);  // deselect method 
//		
//		s1.selectByIndex(2);
	
		
	}

}
