package testrunner1;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h1b.06.15\\eclipse-workspace\\Cucumberproject")
	,glue{"stepdefs1"
	},plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}, 
	monochrome = true)



public class Demologintestrunner {

	
}
