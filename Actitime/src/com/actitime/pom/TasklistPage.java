package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasklistPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;

	@FindBy(xpath = "//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]")
	private WebElement createcustomer;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;

	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement customerDropdown;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")
	private WebElement BIgbang;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomer;

	@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
	private WebElement searchBox;

	@FindBy(className = "highlightToken")
	private WebElement highlightedElement;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='editButton']")
	private WebElement settingsBtn;

	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[text()='ACTIONS']")
	private WebElement actionsBtn;

	@FindBy(xpath="//div[contains(@class,'taskManagement_c')]//div[text()='Delete']")
	private WebElement deleteBtn;

	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deletePermanentlyBtn;
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getHighlightedElement() {
		return highlightedElement;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getActionsBtn() {
		return actionsBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeletePermanentlyBtn() {
		return deletePermanentlyBtn;
	}

	public TasklistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getBIgbang() {
		return BIgbang;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}
}