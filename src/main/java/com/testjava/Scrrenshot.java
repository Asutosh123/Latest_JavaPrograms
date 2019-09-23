package com.testjava;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrrenshot {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ramdv3.migrams.my/mipss-ra-bgd-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("marybang");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("E:\\WorkSpace\\java_program\\Screenshots.png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
                System.out.println(".....Screenshot taken......");
		driver.close();
	}

}
                