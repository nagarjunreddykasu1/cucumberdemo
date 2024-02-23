package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("user launches the application")
	public void lauchappication() {
		System.out.println("user launches the application");
	}
	
	@When("user entered {word} username")
	public void user_entered_valid_username(String username) {
	 System.out.println("user entered username: "+username);  
	}

	@And("user entered {word} password")
	public void user_entered_valid_password(String password) {
	   System.out.println("user entered password: "+password);
	}

	@And("user clicked on Sign In button")
	public void user_clicked_on_sign_in_button() {
	    System.out.println("user clicked on Sign In button");
	}

	@Then("user {word} logged in")
	public void user_should_be_logged_in(String result) {
	    System.out.println("Logged in status: "+result);
	}
	
	/*
	 * @And("user selected age category") public void agecategory(List<String> list)
	 * { for(int i=1;i<list.size();i++) { System.out.println(list.get(i)); } }
	 */
	
	
	
	@And("user selected age category")
	public void agecategory(DataTable table) {
		/*
		 * List<List<String>> list=table.asLists();
		 * 
		 * for(int i=0;i<list.size();i++) {
		 * System.out.println(list.get(i).get(0)+" --- "+list.get(i).get(1)); }
		 */
		
		
		List<Map<String, String>> list=table.asMaps(String.class,String.class);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get("age")+" --- "+list.get(i).get("location"));
		}
		
	}
	
//	@When("user entered invalid username")
//	public void user_entered_invalid_username() {
//	    
//	}
//
//	@When("user entered invalid password")
//	public void user_entered_invalid_password() {
//	    
//	}
//
//	@Then("user should not be logged in")
//	public void user_should_not_be_logged_in() {
//	    
//	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll method code");
	}
	
	@AfterAll
	public static void aafterAll() {
		System.out.println("afterAll method code");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod code");
	}
	
	@After
	public void afterMethod() {
		System.out.println("afterMethod code");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("beforeStep method code");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("afterStep method code");
	}
	
	

}


/*
Hooks:

@BeforeAll
@AfterAll
@Before
@After
@BeforeStep
@AfterStep



 */





























