package com.cc.practicaltest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "not @pending",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"com.cc.practicaltest.steps", "com.cc.practicaltest.support"})
public class TestRunner {
}
