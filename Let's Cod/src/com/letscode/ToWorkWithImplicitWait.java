package com.letscode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithImplicitWait {



	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(0, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(10));
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vyshale.s@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pass@123");
		driver.quit();
		
	}

}
