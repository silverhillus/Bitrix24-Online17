package com.bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
<<<<<<< HEAD
        glue = "com/bitrix24/step_definitions",
        dryRun = false,
        tags = "@employeepost"
=======
        glue = "com/bitrix24/step_definitons",
        dryRun = false
        //tags = ""
>>>>>>> 0e6be1d0c2fce461b0c624b8b2fdad461d3a3105
)


public class BitRunner {

}
