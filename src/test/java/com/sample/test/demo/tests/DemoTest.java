package com.sample.test.demo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.pages.PizzaOrderForm;
import com.sample.test.demo.pages.SuccessModel;

public class DemoTest extends TestBase {
	
	PizzaOrderForm form;
	SuccessModel model;
	
	@BeforeMethod
	public void beforeMethod(){
		form = new PizzaOrderForm(driver);
        //Enter Order Details
        form.selectPizza1(PizzaTypes.LARGE_THREETOPPINGS.getDisplayName())
        .selectPizza1Toppings1(PizzaToppings.MANGOS.getDisplayName())
        .selectPizza1Toppings2(PizzaToppings.MUSHROOMS.getDisplayName());        
	}
	
	
    @Test(description = "Place an Order", priority = 0)
    public void placeOrderTest() {
        
        //Enter personal Details
       form.enterpizza1Quantity("10").enterName("Test").enterEmail("test@test.com").enterPhone("123456789")
        //Enter payment Details
        .clickCreditCard()
        //Place the Order
        .clickPlaceOrder();
        
        model = new SuccessModel(driver);
        System.out.println(model.getDialogMessage());
        assertEquals(model.getDialogMessage(), "Thank you for your order! TOTAL: 135 Large 10 Slices - 2 toppings");
        model.closeDialog();
    }
    
    
    @Test(description = "Select both payment types", priority = 2)
    public void paymentsSelectTest(){    	 
        //Enter personal Details
        form.enterpizza1Quantity("10").enterName("Test").enterEmail("test@test.com").enterPhone("123456789")
        
      //Enter payment Details
        .clickCreditCard().clickCashOnPickUp();
        
    	//Verify if both payments type are selected
        if(form.isCashOnPickUp()){
        	assertEquals(form.isCreditCard(), false);
        }
        if(form.isCreditCard()){
        	assertEquals(form.isCashOnPickUp(), false);
        }
    }
    
    @Test(description = "Verify if Name and Phone are mandatory Fields", priority = 3)
    public void mandatoryFieldsTest(){
    	
       //Enter personal Details
       form.enterpizza1Quantity("10").enterName("").enterEmail("test@test.com").enterPhone("")
       
     //Enter payment Details
       .clickCreditCard().clickCashOnPickUp();
   
   	model = new SuccessModel(driver);
   	assertTrue(model.getDialogMessage().contains("name"));
   	assertTrue(model.getDialogMessage().contains("phone number"));
   	
    }
    
    @AfterMethod
    public void afterMethod(){
    	if(model.isdialog()){
    		model.closeDialog();
    	}
    }
}
