package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/java/FeatureFiles", 
    glue="StepDefinitions",
  //  tags = "@SmokeTest"
   monochrome=true  

    )
    
    
    public class TestRunner {

}
