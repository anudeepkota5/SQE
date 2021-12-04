package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PizzaOrderForm {
	
	@FindBy(id="pizza1Pizza")
	WebElement pizza1;
	
	@FindBy(xpath="//div[@id='pizza1']//select[@class='toppings1']")
	WebElement pizza1Toppings1;
	
	@FindBy(xpath="//div[@id='pizza1']//select[@class='toppings2']")
	WebElement pizza1Toppings2;
	
	@FindBy(id="pizza1Qty")
	WebElement pizza1Quantity;
	
	@FindBy(id="pizza1Cost")
	WebElement pizza1Cost;
	
	@FindBy(id="ccpayment")
	WebElement radioCreditCard;
	
	@FindBy(id="cashpayment")
	WebElement radioCash;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="placeOrder")
	WebElement placeOrderButton;
	
	@FindBy(id="reset")
	WebElement resetButton;
	
	public PizzaOrderForm(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

	public PizzaOrderForm selectPizza1(String value){
		Select sel = new Select(pizza1);
        sel.selectByValue(value);
        return this;
	}
	
	public String getPizza1(){
		Select sel = new Select(pizza1);
        return sel.getFirstSelectedOption().getText();
	}
	
	public PizzaOrderForm selectPizza1Toppings1(String value){
		Select sel = new Select(pizza1Toppings1);
        sel.selectByValue(value);
        return this;
	}
	
	public String getPizza1Toppings1(){
		Select sel = new Select(pizza1Toppings1);
        return sel.getFirstSelectedOption().getText();
	}
	
	public PizzaOrderForm selectPizza1Toppings2(String value){
		Select sel = new Select(pizza1Toppings2);
        sel.selectByValue(value);
        return this;
	}
	
	public String getPizza1Toppings2(){
		Select sel = new Select(pizza1Toppings2);
        return sel.getFirstSelectedOption().getText();
	}
	
	public PizzaOrderForm enterpizza1Quantity(String value){
		pizza1Quantity.clear();
		pizza1Quantity.sendKeys(value);
        return this;
	}
	
	public String getpizza1Quantity(){
        return pizza1Quantity.getText();
	}
		
	public PizzaOrderForm enterpizza1Cost(String value){
		pizza1Cost.sendKeys(value);
        return this;
	}
	
	public String getpizza1Cost(){
        return pizza1Cost.getText();
	}
	
	public PizzaOrderForm enterName(String value){
		name.clear();
		name.sendKeys(value);
        return this;
	}
	
	public String getname(){
        return name.getText();
	}
	
	public PizzaOrderForm enterEmail(String value){
		email.clear();
		email.sendKeys(value);
        return this;
	}
	
	public String getemail(){
        return email.getText();
	}
	
	public PizzaOrderForm enterPhone(String value){
		phone.clear();
		phone.sendKeys(value);
        return this;
	}
	
	public String getphone(){
        return phone.getText();
	}
	
	public PizzaOrderForm clickCreditCard(){
		radioCreditCard.click();
        return this;
	}
	
	public boolean isCreditCard(){
		return radioCreditCard.isSelected();
	}
	
	public PizzaOrderForm clickCashOnPickUp(){
		radioCash.click();
        return this;
	}
	
	public boolean isCashOnPickUp(){
		return radioCash.isSelected();
	}
	
	public PizzaOrderForm clickPlaceOrder(){
		placeOrderButton.click();
        return this;
	}
	
	public PizzaOrderForm clickReset(){
		resetButton.click();
        return this;
	}

}
