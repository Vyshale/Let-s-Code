package com.letscode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWithPopUpHeadlessAndDisable {

	public static void main(String[] args) {
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disbale--notifications");
		opt.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.barbequenation.com/");
		
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		

	}

}
