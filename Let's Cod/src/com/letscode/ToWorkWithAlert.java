package com.letscode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();

		//Simple Alert
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		//Confirm Alert
		driver.findElement(By.id("confirm")).click();
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2.getText());
		alert.dismiss();

		//Prompt Alert
		driver.findElement(By.id("prompt")).click();
		Alert a3 = driver.switchTo().alert();
		System.out.println(a3.getText());
		a3.sendKeys("Vyshale");
		Thread.sleep(3000);
		a3.accept();
		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		
		//Sweet Alert
		driver.findElement(By.id("modern")).click();
		
		

		Thread.sleep(3000);
		driver.quit();		
	}
}
