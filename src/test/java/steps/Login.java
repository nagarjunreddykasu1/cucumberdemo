package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("user launches the application")
	public void lauchappication() {
		System.out.println("user launches the application");
	}
	
	@When("user entered valid username")
	public void user_entered_valid_username() {
	 System.out.println("user entered valid username");  
	}

	@And("user entered valid password")
	public void user_entered_valid_password() {
	   System.out.println("user entered valid password");
	}

	@And("user clicked on Sign In button")
	public void user_clicked_on_sign_in_button() {
	    System.out.println("user clicked on Sign In button");
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	    System.out.println("user should be logged in");
	}
	
	@When("user entered invalid username")
	public void user_entered_invalid_username() {
	    
	}

	@When("user entered invalid password")
	public void user_entered_invalid_password() {
	    
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	    
	}

}
