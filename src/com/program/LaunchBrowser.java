package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{

	public static void main(String[] args) 
	{	System.setProperty("webdriver.chrome.driver","D:\\Important Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		

	}

}
