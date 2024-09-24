package com.letscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToWorkWithWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		String childURL =   driver.getCurrentUrl();
		System.out.println(childURL);
		driver.close();
		list.clear();
		Set<String>windowhandles2 = driver.getWindowHandles();
		list.addAll(windowhandles2);
		driver.switchTo().window(list.get(0));
		String parentURL = driver.getCurrentUrl();
		System.out.println(parentURL );
		
		

	}

}
