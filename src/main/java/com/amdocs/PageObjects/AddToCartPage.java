package com.amdocs.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.action.Action;
import com.amdocs.ProjectDemo.Base;

public class AddToCartPage extends Base{
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/a/div/span[2]")
	WebElement GoToBag;
	
	@FindBy(xpath="//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[2]/button")
	WebElement ProceedToShipping;
	
	@FindBy(xpath="//*[@id=\"dAccountWrapper\"]/div[2]/div[2]")
	WebElement ProceedToPayment;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutPage ClickOnProceedToBuy() throws Throwable {
		Action.click(driver, GoToBag);
		Thread.sleep(1500);
		Action.click(driver, ProceedToShipping);
		Thread.sleep(1000);
		Action.click(driver, ProceedToPayment);
		return new CheckOutPage();
	}
}
