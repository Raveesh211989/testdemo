package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        //System.setProperty("webdriver.chrome.driver", "C://Users//ravee//eclipse-workspace//ChromeDriver//chromedriver-win64//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        System.out.println("strting");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raveesh.kumars@gmail.com");
        //driver.findElement(By.id("gwt-uid-5")).sendKeys("Raveesh");
        Thread.sleep(1000);
        //driver.findElement(By.id("gwt-uid-7")).sendKeys("Kumar");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Raghosingh2001*");
        Thread.sleep(1000);
        //driver.findElement(By.id("gwt-uid-9")).sendKeys("7382387888");
        driver.findElement(By.name("login")).click();
        Thread.sleep(9000);
        //driver.findElement(By.id("gwt-uid-11")).sendKeys("hdasjdsa@gmail.com");
        //Thread.sleep(1000);
        //driver.findElement(By.id("gwt-uid-13")).sendKeys("2/11/24,");
        //Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id=\"addressbook20-315424805\"]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
        //Thread.sleep(1000);
        
        driver.quit();
        System.out.println("finished");
   
    }
}
