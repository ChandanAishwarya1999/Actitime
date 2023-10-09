package com.actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class HomePage {
	
@FindBy(id="container_tasks")
private WebElement task;

@FindBy(id="logoutLink")
private WebElement logout;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void tasklist() {
	task.click();
	}	
public void logout() {
	logout.click();
	}	
}
