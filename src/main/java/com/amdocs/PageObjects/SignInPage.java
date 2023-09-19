package com.amdocs.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.action.Action;
import com.amdocs.ProjectDemo.Base;


public class SignInPage extends Base{
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")
	WebElement Continue;
	
		@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[5]/input")
	WebElement StartShopping;
	
	public SignInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname) throws Throwable{
		Action.type(phonenumber,uname);
		Action.click(driver, Continue);
		Thread.sleep(20000);
		Action.click(driver, StartShopping);
		Action.Wait(driver, 40);
		return new HomePage();
	}

}