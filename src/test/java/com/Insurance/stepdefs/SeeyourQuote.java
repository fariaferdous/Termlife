package com.Insurance.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeeyourQuote {

	WebDriver driver;

	@Given("^User visits homepage\\.$")
	public void user_visits_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faria\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@When("^user selects Gender,Date of Birth,Coverage Amount,Termlenght$")
	public void user_selects_Gender_Date_of_Birth_Coverage_Amount_Termlenght() throws Throwable {

	}

	@When("^user clicks yes radio button on Are you a AAA member  \\.$")
	public void user_clicks_yes_radio_button_on_Are_you_a_AAA_member() throws Throwable {

	}

	@When("^user clicks yes radio button on Have you used nicotine in the last (\\d+) months \\.$")
	public void user_clicks_yes_radio_button_on_Have_you_used_nicotine_in_the_last_months(int arg1) throws Throwable {

	}

	@When("^user enters Zip Code, Email, Weight \"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\" \\.$")
	public void user_enters_Zip_Code_Email_Weight(String arg1, String arg2, String arg3) throws Throwable {

	}

	@Then("^user clicks on SeeYourQuote button\\.$")
	public void user_clicks_on_SeeYourQuote_button() throws Throwable {

	}

}
