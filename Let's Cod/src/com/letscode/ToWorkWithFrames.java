package com.letscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		WebElement myframe = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(myframe);
		driver.findElement(By.name("fname")).sendKeys("Vyshale");
		driver.findElement(By.name("lname")).sendKeys("Sureshbabu");
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src=\"innerFrame\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vyshale.s@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Watch tutorial")).click();
		Thread.sleep(2000);
		driver.close();




	}

}
