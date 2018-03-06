package com.anu.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Test
	public void doLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\com\\anu\\executables\\chromedriver.exe");

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
		
		driver.get("http://gmail.com");
		System.out.println("gmail launched");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("testuser1@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='CwaK9'])[2]"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/content/span"))).click();
		Thread.sleep(5000);

		String str = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']/div[2]/div[2]"))).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Enter a password","Test case fail");
	}
}
