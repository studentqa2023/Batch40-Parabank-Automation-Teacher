package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	//Open Chrome driver
	public WebDriver getChromeDriver(WebDriver driver) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	//Open Firefox driver
	public WebDriver getFirefoxDriver(WebDriver driver) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	//Open MS Edge driver
	public WebDriver getEdgeDriver(WebDriver driver) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}	

}
