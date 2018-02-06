package com.Insurance.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SeeyourQuote {
	
	WebDriver driver;
	
	public SeeyourQuote(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}


}
