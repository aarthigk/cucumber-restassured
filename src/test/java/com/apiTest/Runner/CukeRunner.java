package com.apiTest.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
        plugin = {"pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        },
        features = {"features"},
       glue = {"com.apiTest.ApiTest"}
       
)

public class CukeRunner {
}