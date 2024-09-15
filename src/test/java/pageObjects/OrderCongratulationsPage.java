package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderCongratulationsPage  extends Basepage{

	public OrderCongratulationsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	
	@FindBy(xpath="//p[text()='Congratulations! Your order has been confirmed!']") WebElement mgsOrderConfirmation ;
	
	
	public boolean getOrderConfirmationMessage() 
	
	{
		try 
		{
			return mgsOrderConfirmation.isDisplayed();
		}
		catch(Exception e) 
		{
			return false;
		}
		
	}
}
