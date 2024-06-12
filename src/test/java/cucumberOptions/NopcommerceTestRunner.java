package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json" },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@feature"
)
public class NopcommerceTestRunner {
}
