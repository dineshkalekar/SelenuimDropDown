package DropdownHandals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");

		WebElement e1 = driver.findElement(By.xpath("//select[@id='drop1']"));
		e1.click();

		Select a1 = new Select(e1);

		List<WebElement> size = a1.getOptions();
		int Name=size.size();
		
		System.out.println(Name);
		
		for(int i=0;i<Name;i++) {
			a1.selectByIndex(i);
			WebElement getName=size.get(i);
			String ListPrint=getName.getText();
			System.out.println(ListPrint);
			a1.deselectByIndex(i);
			
		}

	}

}
