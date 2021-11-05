package com.apiTest.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/TestOne.feature",
        glue ="com.apiTest.ApiTest"
)
public class CukeRunner {
}