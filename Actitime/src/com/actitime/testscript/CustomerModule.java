package com.actitime.testscript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasklistPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createcustomer() throws InterruptedException, IOException {
//HomePage h = new HomePage(driver);	
//h.tasklist();
//
//TasklistPage t = new TasklistPage(driver);
//
//t.getAddNewBtn().click();
//Thread.sleep(2000);
//
//t.getNewcustomer().click();
//Thread.sleep(2000);

//FileLib fib = new FileLib();
//  String name = fib.readdatafromexcel("createcustomer", 1, 2);
//  
//t.getCreatecustomer().sendKeys(name);
//Thread.sleep(2000);
//
//String desc = fib.readdatafromexcel("createcustomer", 1, 3);
//t.getDescription().sendKeys(desc);
//Thread.sleep(2000);
//
//t.getCustomerDropdown().click();
//Thread.sleep(2000);
//
//t.getBIgbang().click();
//Thread.sleep(2000);

//t.getCreateCustomer().click();
//Thread.sleep(5000);

}
	
	 @Test
	    public void deletecustomer() throws IOException, InterruptedException{
//		HomePage h = new HomePage(driver);	
//		h.tasklist();
//		Thread.sleep(2000);
//		TasklistPage t = new TasklistPage(driver);
//		FileLib fib = new FileLib();
//		  String name = fib.readdatafromexcel("createcustomer", 1, 2);
//		t.getSearchBox().sendKeys(name);Thread.sleep(2000);
//		t.getHighlightedElement().click();Thread.sleep(2000);
//		t.getSettingsBtn().click();Thread.sleep(2000);
//		t.getActionsBtn().click();Thread.sleep(2000);
//		t.getDeleteBtn().click();Thread.sleep(2000);
//		t.getDeletePermanentlyBtn().click();Thread.sleep(2000);
//		
	}
	}