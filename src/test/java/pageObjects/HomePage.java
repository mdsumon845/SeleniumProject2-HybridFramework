package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locator
	@FindBy(xpath="//div[@class='logo pull-left']//img") WebElement logo;
	@FindBy(xpath="//a[normalize-space()='Signup / Login']") WebElement btnSignupLogin;
	@FindBy(xpath="//input[@name='name']") WebElement txtName;
	@FindBy(xpath="(//input[@name='email'])[2]") WebElement txtEmail;
	@FindBy(xpath="//button[text()='Signup']") WebElement btnSignup;
	
	
	
	
	
	//action method
	
	public boolean displayLogo() 
	{
		return logo.isDisplayed();
	}
	

	public void clickSignupLogin() 
	{
		btnSignupLogin.click();
	}
	
	public void setName(String name) 
	{
		txtName.sendKeys(name);
	}
	
	public void setEmail(String email) 
	{
		txtEmail.sendKeys(email);
	}
	
	public void clickOnSignupBtn() 
	{
		btnSignup.click();	
	}
}
