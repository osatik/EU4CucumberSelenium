package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"
               //"@navigate and not @wip" //old syntex {"@login","~@wip","~@sales_manager"} ========> run all but do not run wip and salesmanager
               //"@driver and @VYT-123" //old syntex {"@driver","@VYT-123"} ====> test feature that have both two annotation
               //"@driver or @store_manager"  /old syntex  "@driver, @store_manager" =====>test each annotation one by one separately

)
public class CukesRunner {
}
