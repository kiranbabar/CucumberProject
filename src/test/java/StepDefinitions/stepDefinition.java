package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)


public class stepDefinition {
	public WebDriver driver;
	
	/*@Given("^Initialise the chrome driver$")
	    public void initialise_the_chrome_driver() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Win-10\\Desktop\\chromedriver\\chromedriver.exe");

		 driver=new ChromeDriver();
   
	    }

	    @When("^User navigates to url$")
	    public void user_navigates_to_url() throws Throwable {
	        driver.get("https://login.salesforce.com/?locale=in");
	    }

	    @Then("^User enter username and password and click on login$")
	    public void user_enter_username_and_password_and_click_on_login() throws Throwable {
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kiran");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secure123");
	        driver.findElement(By.xpath("//input[@id='Login']"));
	    }
	    @Then("^user should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable {
	        System.out.println("hello");
	    }

	    @Then("^user should be able to signUp$")
	    public void user_should_be_able_to_signup() throws Throwable {
	   
	    }*/

	 @Given("^Initialise the chrome driver$")
	    public void initialise_the_chrome_driver() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Win-10\\Desktop\\chromedriver\\chromedriver.exe");

		 driver=new ChromeDriver();
    
	    }

	    @When("^User navigates to \"([^\"]*)\"$")
	    public void user_navigates_to_something(String strArg1) throws Throwable {
	      driver.get(strArg1);
	    }

	    @Then("^User enter (.+) and (.+) and click on login$")
	    public void user_enter_and_and_click_on_login(String username, String password) throws Throwable {
	    	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		        driver.findElement(By.xpath("//input[@id='Login']"));
	    }

	    @Then("^user should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable {
	       System.out.println("hello");
	    }

	}
	   

	        



