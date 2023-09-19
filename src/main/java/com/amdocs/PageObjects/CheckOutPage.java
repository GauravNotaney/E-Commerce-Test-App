package com.amdocs.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.action.Action;
import com.amdocs.ProjectDemo.Base;

public class CheckOutPage extends Base{
	
	@FindBy(xpath = "//*[@id=\"card_number\"]")
	WebElement CardNumber;

	
	@FindBy(xpath = "//*[@id=\"name_on_card\"]")
	WebElement NameOnCard;
	
	@FindBy(xpath="//*[@id=\"form_id\"]/div[4]/div/div[1]/div/div/div/span/i/svg")
	WebElement mm;
	
	@FindBy(xpath="//*[@id=\"form_id\"]/div[4]/div/div[2]/div/div/div/span/i/svg")
	WebElement yy;
	
	@FindBy(xpath="//*[@id=\"cvv\"]")
	WebElement cvv;
	
	@FindBy(xpath="//*[@id=\"form_id\"]/div[6]/div/button")
	WebElement CompletePayment;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutProcess() throws Throwable {
		Action.click(driver, CardNumber);
		Thread.sleep(5000);
		Action.type(CardNumber,"1234 1234 4321 4321");
		Action.click(driver,NameOnCard);
		Action.type(NameOnCard,"Gaurav Notaney");
		Action.Wait(driver, 7);
		//Action.click(driver, CompletePayment);
	}
	

}

