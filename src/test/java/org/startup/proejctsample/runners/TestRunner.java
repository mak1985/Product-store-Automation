package org.startup.proejctsample.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // Path to your feature files
        glue = "org.startup.proejctsample.stepdefinitions"  ,
        plugin = {
                "pretty",                               // Standard pretty format console output
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_script.txt"
        },
        monochrome = true,                          // Display console output in a readable format
        tags = "",                             // Run scenarios tagged as "@smoke" (customize as needed)
        dryRun = false

                                // Display console output in a readable format
        // Run scenarios tagged as "@smoke" (customize as needed)

)
public class TestRunner {
}
