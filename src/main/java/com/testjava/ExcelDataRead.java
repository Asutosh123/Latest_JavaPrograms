package com.testjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		
		public class ExcelDataRead {

			public static WebDriver driver;
			
			public static void main(String[] args) throws IOException {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://ramdv3.migrams.my/mipss-ra-bgd-web/");
				driver.manage().window().maximize();
				
		        File src=new File("C:\\Users\\asutosh.m\\Desktop\\Book1.xls");
		    	FileInputStream fis=new FileInputStream(src);
		    	HSSFWorkbook wb=new HSSFWorkbook(fis);
		    	HSSFSheet sh=wb.getSheet("Sheet1");
		    	int count=sh.getLastRowNum();
		    	System.out.println("Total number of rows:"+count);
		    	int column=sh.getRow(0).getLastCellNum();
		    	System.out.println("Total number of columns:"+column);
		    	
		    	for(int i=0;i<= count;i++)
		    	 {
		    		Row row=sh.getRow(i);
		    	  String userName= row.getCell(0).getStringCellValue();
		    			System.out.println(" \n userName"+userName);
		    			
		         String  password1= row.getCell(1).getStringCellValue();
		    				System.out.println("\n password1"+password1);
		    			
		    		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password1);
		            driver.findElement(By.xpath("//input[@value='Login']")).click();
		            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		           

		    		
		    	 }
			}
		}
		
		
		
	


