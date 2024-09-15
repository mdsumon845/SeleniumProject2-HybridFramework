package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage  extends Basepage{

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	@FindBy(xpath="//li[text()='Payment']") WebElement txtPayment;
	@FindBy(xpath="//input[@name='name_on_card']") WebElement txtNameOnCard;
	@FindBy(xpath="//input[@name='card_number']") WebElement txtCardNumber;
	@FindBy(xpath="//input[@name='cvc']") WebElement txtCvc;
	@FindBy(xpath="//input[@name='expiry_month']") WebElement txtExpiryMonth;
	@FindBy(xpath="//input[@name='expiry_year']") WebElement txtExpiryYear;
	@FindBy(xpath="//button[text()='Pay and Confirm Order']") WebElement btnConfirmOrder;
	//p[text()='Congratulations! Your order has been confirmed!']
	
	
	//action method
	
	public boolean getPaymentPage() 
	
	{
		try 
		{
			return txtPayment.isDisplayed();
		}
		catch(Exception e) 
		{
			return false;
		}
		
	}
	
	
	public void setNameOnCard(String cardName) 
	{
		txtNameOnCard.sendKeys(cardName);
	}
	
	public void setCardNumber(String cardNumber) 
	{
		txtCardNumber.sendKeys(cardNumber);
	}
	
	public void setCvc(String cvc) 
	{
		txtCvc.sendKeys(cvc);	
	}
	
	public void setExpiryMonth(String month) 
	{
		txtExpiryMonth.sendKeys(month);	
	}
	
	public void setExpirYear(String year) 
	{
		txtExpiryYear.sendKeys(year);	
	}
	
	public void clickOnPayAndConfirmOrderBtn() 
	{
		btnConfirmOrder.click();
	}
	
	
	
}
