package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Priyapom1 {

	WebDriver driver;
	public Priyapom1(WebDriver dri){
		driver=dri;
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	//Declaration --Rule1
			@FindBy(name="user")
			private  WebElement usernameTextfield;
			@FindBy(name="password")
			private  WebElement passwordTextfield1;
			@FindBy(name="btnlogin")
			private WebElement loginButton;
			
			public void getUsernameTextfield(String name) {
				 usernameTextfield.click();
				 usernameTextfield.sendKeys(name);
				 
			}

			public void getPasswordTextfield1(String pass) {
				 passwordTextfield1.click();
				 passwordTextfield1.sendKeys(pass);
				 
			}

			public void getLoginButton() {
				 loginButton.click();
			}
	
}
