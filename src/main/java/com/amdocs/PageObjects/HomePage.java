package com.amdocs.PageObjects;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.action.Action;
import com.amdocs.ProjectDemo.Base;

public class HomePage  extends Base{
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//*[@id=\"products\"]/div[3]/div[1]/div/div[1]/a/div/div[1]/div[1]/img")
	WebElement firstProduct;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")
	WebElement AddToBag;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[1]/img")
	WebElement Wishlist;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[4]/a")
	WebElement CustCare;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct(String item) throws Throwable {
		Action.type(search, item);
		Action.click(driver, SubmitBtn);
	}
	
	
	public AddToCartPage SelectFirstProduct() throws Exception {
		Action.click(driver, firstProduct);
	      Action.Wait(driver, 5);

	     ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("tab switched");
	      Action.Wait(driver, 5);	  
	      Action.click(driver, AddToBag);
	      return new AddToCartPage();
	}
}


	