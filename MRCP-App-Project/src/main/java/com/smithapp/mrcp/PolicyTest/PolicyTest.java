package com.smithapp.mrcp.PolicyTest;

import com.smithapp.mrcp.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class PolicyTest {
	WebConnector sel = new WebConnector();
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to_on(String url, String browser) {
	System.out.println("I am going to "+ url +" on "+ browser);
    sel.openBrowser(browser);
	sel.navigate(url);
	}

	@Given("^I enter \"([^\"]*)\" name as \"([^\"]*)\"$")
	public void I_enter_name_as(String object, String text){
		System.out.println("Entering "+ object+" Value "+ text);
		
	}

	@Given("^I enter \"([^\"]*)\" date as \"([^\"]*)\"$")
	public void I_enter_date_as(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
	}
	
	@Given("^I enter \"([^\"]*)\" date \"([^\"]*)\"$")
	public void I_enter_date(String object, String text){
		System.out.println("Entering "+ object+" Value "+ text);
		sel.type(text, object);
	}

	@Given("^I click the \"([^\"]*)\" to find avaialbe hotel$")
	public void I_click_the_to_find_avaialbe_hotel(String object) {
		System.out.println("clicking on "+ object);	
		sel.click(object);
		
		
	}

	@Then("^I should \"([^\"]*)\" for the hotel$")
	public void I_should_for_the_hotel(String ExpectedResult) {
		System.out.println("Available "+ ExpectedResult);	
		
		
		
		
	}

	@Then("^I click the \"([^\"]*)\" to go on hotelpage$")
	public void I_click_the_to_go_on_hotelpage(String object) {
		System.out.println("clicking on "+ object);
		
	}

	@Then("^click on \"([^\"]*)\" of the room$")
	public void click_on_of_the_room(String object) {
	System.out.println("clicking on "+ object);	
		
	}

	@Then("^I should see \"([^\"]*)\" policy sentence$")
	public void I_should_see_policy_sentence(String ExpectedResult) {
		System.out.println("Policy Sentence "+ ExpectedResult);
		
	}

	@Then("^I click on the \"([^\"]*)\" button$")
	public void I_click_on_the_button(String object) {
		System.out.println("clicking on "+ object);	
			
		
	}

	@Then("^I enter \"([^\"]*)\" sleeping in the room as \"([^\"]*)\"$")
	public void I_enter_sleeping_in_the_room_as(String object, int arg2) {
		System.out.println("Entering "+ object+" Value "+ arg2);
		
	}

	@Then("^I click the \"([^\"]*)\" button to add extras$")
	public void I_click_the_button_to_add_extras(String object) {
		
		System.out.println("clicking on "+ object);
	}

	@Then("^I click \"([^\"]*)\" button to login$")
	public void I_click_button_to_login(String object) {
		
		System.out.println("clicking on "+ object);
		
	}

	@Then("^I click \"([^\"]*)\" as new customer$")
	public void I_click_as_new_customer(String object) {
		System.out.println("clicking on "+ object);
		
		
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_as(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);	
		
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\" in the surname field$")
	public void I_enter_as_in_the_surname_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);	
		
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\" in contact field$")
	public void I_enter_as_in_contact_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
	}

	@Then("^I \"([^\"]*)\" as \"([^\"]*)\" from dropdown$")
	public void I_as_from_dropdown(String object, String text) {
		System.out.println("selecting "+ object+" Value "+ text);
	}
	

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\" in the line(\\d+) field$")
	public void I_enter_as_in_the_line_field(String arg1, String arg2, int arg3) {
		
	}

	@Then("^I enter my \"([^\"]*)\" as \"([^\"]*)\" in the town field$")
	public void I_enter_my_as_in_the_town_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
		
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\" in the postcode field$")
	public void I_enter_as_in_the_postcode_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
		
	}

	@Then("^I select \"([^\"]*)\" as \"([^\"]*)\" from card type dropdown$")
	public void I_select_as_from_card_type_dropdown(String object, String text) {
		System.out.println("selecting "+ object+" Value "+ text);
		
	}

	@Then("^I enter my \"([^\"]*)\" as \"([^\"]*)\" in the card field$")
	public void I_enter_my_as_in_the_card_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
		
		
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\" in name on card field$")
	public void I_enter_as_in_name_on_card_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);
		
	}

	@Then("^I select card \"([^\"]*)\" as \"([^\"]*)\" from month dropdown$")
	public void I_select_card_as_from_month_dropdown(String object, String text) {
		
		System.out.println("selcting "+ object+" Value "+ text);
	}

	@And("^I select card \"([^\"]*)\" as \"([^\"]*)\" from year dropdown$")
	public void I_select_card_as_from_year_dropdown(String object, String text){
		System.out.println("selecting "+ object+" Value "+ text);
		
	}

	@And("^I enter card \"([^\"]*)\" as \"([^\"]*)\" in cvv field$")
	public void I_enter_card_as_in_cvv_field(String object, String text) {
		System.out.println("Entering "+ object+" Value "+ text);	
	}

	@And("^I click to \"([^\"]*)\" checkbox$")
	public void I_click_to_checkbox(String object)  {
		System.out.println("clicking on "+ object);
	}

	@And("^I click on the \"([^\"]*)\" link$")
	public void I_click_on_the_link(String object) {
		System.out.println("clicking on "+ object);
	}

	@And("^I should the see \"([^\"]*)\"$")
	public void I_should_the_see(String ExpectedResult) {
	System.out.println("Policy Sentence "+ ExpectedResult);
		
	}
	
	
	
}
