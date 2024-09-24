package com.letscode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.shoppersstack.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@name='women']"));

		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();Thread.sleep(3000);
		driver.findElement(By.partialLinkText("SAREES")).click();



	}

}
