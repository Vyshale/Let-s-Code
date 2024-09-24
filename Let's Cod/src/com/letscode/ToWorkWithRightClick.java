package com.letscode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithRightClick {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("random");
		 WebElement ele = driver.findElement(By.id("hello"));
		 Actions act = new Actions(driver);
		 act.contextClick(ele).perform();
		 driver.findElement(By.id("another")).click();
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();

	}

}
