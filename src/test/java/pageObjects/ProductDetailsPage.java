package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage  extends Basepage{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locator
	
	@FindBy(xpath="//span[text()='Rs. 400']") WebElement textProductPrice;
	@FindBy(xpath="//button[normalize-space()='Add to cart']") WebElement btnAddToCart;
	@FindBy(xpath="//p[text()='Your product has been added to cart.']") WebElement mgsProductAddedConfirmation;
	@FindBy(xpath="//u[text()='View Cart']") WebElement btnViewCart;
	
	

	public boolean productAddingConfirmationMgs() 
	
	{
		try 
		{
			return mgsProductAddedConfirmation.isDisplayed();
		}
		catch(Exception e) 
		{
			return false;
		}
		
	}
	
	public void clickItemsToNavigateToCart() 
	{
		btnAddToCart.click();	
	}
	
	public void clickOnViewCartBtn() 
	{
		btnViewCart.click();
	}
}
