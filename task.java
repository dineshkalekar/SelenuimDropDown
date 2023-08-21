package DropdownHandals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class task {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='second']"));
		e1.click();
		
		org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(e1);
		List<WebElement> size=sel.getOptions();
		int d1=size.size();
		
	//	System.out.println(d1);
		for(int i=0;i<d1;i++) {
		sel.selectByIndex(i);
		WebElement getName=size.get(i);
		String PrintList=getName.getText();
		System.out.println(PrintList);
		
	
		
//		sel.deselectByIndex(1);	
//		WebElement getDeseleName=size.get(1);
//		String DeSelectName=getDeseleName.getText();
//		//System.out.println("AfterDselect");
//		System.out.println(DeSelectName);
//		
		}
	
		
		// Desected Text Print 	
		
		
		sel.deselectByIndex(1);
		
		String DeSeleText=size.get(1).getText();
		
		System.out.println("Deselected TExt="+DeSeleText);
		
	}

}
