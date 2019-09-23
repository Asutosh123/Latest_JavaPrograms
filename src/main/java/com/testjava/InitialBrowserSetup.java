package com.testjava;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialBrowserSetup {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriverManager.chromedriver().setup();
		  String downloadFilepath = System.getProperty("user.dir")+ "/src/test/resources/DownloadedFile";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory",  downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			//logger.info("Trying to Launch" + bType + "Browser");
		  driver = new ChromeDriver(options);
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  
		//  Alert alt = driver.switchTo().alert();
		 // alt.accept();
		  
		  driver.findElement(By.xpath("//button[text()='Find trains']")).click();
		  
	}

}
