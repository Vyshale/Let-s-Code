package com.letscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers= table.findElements(By.tagName("th"));

		for(WebElement header : headers)
		{
			String headerText = header.getText();
			System.out.println(headerText);
		}

		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int rowSize = allRows.size();
		System.out.println(rowSize);

		if(rowSize == 3)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}

		for(int i = 0; i<rowSize;i++)
		{
			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			WebElement lastName = rows.get(1);
			String text1 = lastName.getText();
			if(text1.equals("raj"))
			{
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
		}

	}

}
