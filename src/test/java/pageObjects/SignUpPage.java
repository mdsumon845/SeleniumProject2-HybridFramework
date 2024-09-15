package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends Basepage{

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath="//input[@id='id_gender1']") WebElement selectTitle;
	@FindBy(xpath="//input[@id='password']") WebElement txtPwd;
	@FindBy(xpath="//select[@id='days']") WebElement selectDay;
	@FindBy(xpath="//select[@id='months']") WebElement selectMonth;
	@FindBy(xpath="//select[@id='years']") WebElement selectyear;
	@FindBy(xpath="//input[@id='newsletter']") WebElement checkNewsletter;
	@FindBy(xpath="//input[@id='first_name']") WebElement txtFirstName;
	@FindBy(xpath="//input[@id='last_name']") WebElement txtLastName;
	@FindBy(xpath="//input[@id='company']") WebElement txtCompany;
	@FindBy(xpath="//input[@id='address1']") WebElement txtAddress1;
	@FindBy(xpath="//input[@id='address2']") WebElement txtAddress2;
	@FindBy(xpath="//select[@id='country']") WebElement selectCountry;
	@FindBy(xpath="//input[@id='state']") WebElement setState;
	@FindBy(xpath="//input[@id='city']") WebElement setCity;
	@FindBy(xpath="//input[@id='zipcode']") WebElement setZipCode;
	@FindBy(xpath="//input[@id='mobile_number']") WebElement setMobileNumber;
	@FindBy(xpath="//button[text()='Create Account']") WebElement btnCreateAccount;
	@FindBy(xpath="//b[text()='Account Created!']") WebElement mgsConfirmation;
	
	//action method
	
	public void selectTitle() 
	{
		selectTitle.click();	
	}
	
	public void setPassword(String pwd) 
	{
		txtPwd.sendKeys(pwd);
	}
	
	public void selectDay() 
	{
		WebElement day=selectDay;	
		Select select=new Select(day);
		select.selectByVisibleText("25");	
	}
	
	public void selectMonth() 
	{
		WebElement month=selectMonth;	
		Select select=new Select(month);
		select.selectByVisibleText("October");	
	}
	
	public void selectYear() 
	{
		WebElement year=selectyear;	
		Select select=new Select(year);
		select.selectByVisibleText("1995");	
	}
	
	public void selectNewsletter() 
	{
		checkNewsletter.click();
	}
	
	public void setFirstName(String firstName) 
	{
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) 
	{
		txtLastName.sendKeys(lastName);
	}
	
	public void setCompanyName(String companyName) 
	{
		txtCompany.sendKeys(companyName);
	}
	
	public void setAddress1(String address1) 
	{
		txtAddress1.sendKeys(address1);
	}
	
	
	public void setAddress2(String address2) 
	{
		txtAddress2.sendKeys(address2);
	}
	
	public void selectCountry() 
	{
		WebElement country=selectCountry;
		Select select=new Select(country);
		select.selectByVisibleText("Australia");	
	}
	
	public void setState(String state) 
	{
		setState.sendKeys(state);
	}
	
	public void setCity(String city) 
	{
		setCity.sendKeys(city);
	}
	
	public void setZipCode(String zipCode) 
	{
		setZipCode.sendKeys(zipCode);
	}
	
	public void setMobileNumber(String number) 
	{
		setMobileNumber.sendKeys(number);
	}
	
	public void clickONCreateAccount() 
	{
		btnCreateAccount.click();
	}
	
	
	public boolean getConfirmationMgs() 
	{
		try{
			return mgsConfirmation.isDisplayed();
		}catch(Exception e) 
		{
			return false;
		}
	}
	//action method
	

}
