package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.beust.jcommander.Parameter;

public class BaseClass {
	public  WebDriver driver;
	@BeforeClass@Parameters("browser")
	public void openBrowser(String browser) throws IOException {
		
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();	
		}else if(browser.equals("mozilla"))
		{
			driver=new FirefoxDriver();
		}else if (browser.equals("edge"))
		{driver=new EdgeDriver();
	}
		FileLib fib=new FileLib();
		String url = fib.readdataformproperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("openBrowser",true);
	}

	@BeforeMethod
	public void login() throws IOException {
		LoginPage l = new LoginPage(driver);
		FileLib fib = new FileLib();
		String username = fib.readdataformproperty("username");
		String password = fib.readdataformproperty("password");
		l.action(username,password);
		Reporter.log("login",true);	
	}
	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.logout();
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser",true);
	}
}