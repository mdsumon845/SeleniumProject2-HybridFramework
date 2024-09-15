package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Basepage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	@FindBy(xpath="//table[@class='table table-condensed']//tbody//tr//td[5]//p") WebElement txtCheckoutPageTotalPrice;
	@FindBy(xpath="//textarea[@name='message']") WebElement txtComment;
	@FindBy(xpath="//a[text()='Place Order']") WebElement btnPlaceOrder;
	
	
	//action method
	
	public String  getTotalPrice() 
	{
		try 
		{
			return txtCheckoutPageTotalPrice.getText();
			
		}catch(Exception e)
		{
			return null;
		}
		
		
	}
	
	public void setComment(String comment) 
	{
		txtComment.sendKeys(comment);
	}
	
	public void clickOnPlaceOderBtn() 
	{
		btnPlaceOrder.click();	
	}
}
