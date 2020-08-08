package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefination {
		
	@Given("^User is on Landing page of (.+)$")
    public void user_is_on_landing_page_of_(String url) {

		 System.setProperty("webdriver.chrome.driver", "F:\\Automation 2020\\ChromeDriver 83\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				System.out.println("User opened the site");
				
	}
	
	
	
	@When("^User click on Login button$")
	public void user_click_on_login_button() throws Throwable {
		System.out.println("User clicked on login button");
	}

	@Then("^User redirect to Login page$")
	public void user_redirect_to_login_page() throws Throwable {
		System.out.println("User redirected to login page");
	}

	@And("^User id password text field displayed$")
	public void user_id_password_text_field_displayed() throws Throwable {
		System.out.println("User ID field Displayed");
	}
	

}