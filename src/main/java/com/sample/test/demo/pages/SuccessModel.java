package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessModel {
	
	@FindBy(id="dialog")
	WebElement dialog;
	
	@FindBy(xpath="//div[@id='dialog']/p")
	WebElement dialogText;
	
	@FindBy(xpath="//button[@title='Close']")
	WebElement close;
	
	public SuccessModel(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isdialog(){
		return dialog.isDisplayed();
	}
	
	public String getDialogMessage(){
		return dialogText.getText();
	}
	
	public void closeDialog(){
		close.click();
	}
	
		
	
	

}
