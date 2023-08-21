package DropdownHandals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class getOptionMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement e1=driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		
		Select s1=new Select(e1);
		List<WebElement> list=s1.getOptions();
		int size=list.size();
		
		System.out.println(size);
		for(int i=0;i<size;i++) {
			s1.selectByIndex(i);
			WebElement d1=list.get(i);
			String getName=d1.getText();
			System.out.println(getName);
			//s1.deselectByIndex(i);
			
//			s1.deselectByIndex(1);
//			s1.deselectByValue("audix");
//			s1.deselectByVisibleText("Volvo");
			
		}
//		for(int j=0;j<size;j++) {
//			s1.deselectByIndex(j);
//		}


	}

}
