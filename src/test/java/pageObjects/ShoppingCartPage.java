package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Basepage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locator
	@FindBy(xpath="//table[@id='cart_info_table']//tbody//tr//td[3]//p") WebElement textCartPageProductPrice;
	@FindBy(xpath="//a[text()='Proceed To Checkout']") WebElement btnCheckout;
	
	//action method
	
	public String  getCartPageProductPrice() 
	{
		try 
		{
			return textCartPageProductPrice.getText();
		}catch(Exception e)
		{
			return null;
		}
		
		
	}
	public void clickOnProceedCheckoutBtn() 
	{
		btnCheckout.click();
	}
}
