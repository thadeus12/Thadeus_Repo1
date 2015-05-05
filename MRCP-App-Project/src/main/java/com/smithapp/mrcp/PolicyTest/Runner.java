package com.smithapp.mrcp.PolicyTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format={"html:output"},
		
		features={"src/test/resources/com/smithapp/mrcp/PolicyTest/Policy.feature"})

public class Runner{
	
	

}
