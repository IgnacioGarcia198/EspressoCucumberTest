package com.ignacio.espressocucumbertest.test.runner;

import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber::class)
@CucumberOptions(
        glue = {"com.ignacio.espressocucumbertest.test.cucumber"},
        //format = ["junit:/data/data/com.mytest/JUnitReport.xml", "json:/data/data/com.mytest/JSONReport.json"],
        //tags = ["~@wip"],
        features = {"features"}
)
public class CucumberTestConfig extends CucumberAndroidJUnitRunner {}
