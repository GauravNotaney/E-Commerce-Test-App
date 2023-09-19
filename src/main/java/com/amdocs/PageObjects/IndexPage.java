package com.amdocs.PageObjects;

import org. openqa .selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ProjectDemo.Base;
import com.amdocs.action.Action;

public class IndexPage extends Base {
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")
	WebElement SignIn;
	
	public IndexPage() {
		PageFactory.initElements(driver,this);
	}
	
	public SignInPage ClickOnSignIn() throws Throwable{
		Action.click(driver,SignIn);
		return new SignInPage();		
	}

}
