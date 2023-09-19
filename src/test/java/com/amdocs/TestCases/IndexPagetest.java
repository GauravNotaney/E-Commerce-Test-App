package com.amdocs.TestCases;

import com.amdocs.ProjectDemo.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.PageObjects.IndexPage;
import com.amdocs.PageObjects.AddToCartPage;
import com.amdocs.PageObjects.CheckOutPage;
import com.amdocs.PageObjects.HomePage;
import com.amdocs.PageObjects.SignInPage;


public class IndexPagetest extends Base {

		private IndexPage indexPage;
		
		 @BeforeMethod
		    public void setup() throws Throwable {
			 	loadConfig();
				launch();
		      
		        indexPage = new IndexPage();
		    }
		 
		@Test
		    public void loginTest() throws Throwable {
		        SignInPage signin= indexPage.ClickOnSignIn();
		        HomePage home= signin.login(getUsername());
		        Thread.sleep(2000);
			//HomePage home=new HomePage();
		        home.SearchProduct("watches");
		        Thread.sleep(1000);
		     AddToCartPage item =   home.SelectFirstProduct();
		        item.ClickOnProceedToBuy();
		        Thread.sleep(1000);
		        CheckOutPage check=new CheckOutPage();
		        check.checkoutProcess();
		        
		        
		       
		        
		    }
	}

