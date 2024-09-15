package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage  extends Basepage{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locator
	@FindBy(xpath="//a[@href='/products']") WebElement linkProducts;
	@FindBy(xpath="//input[@id='search_product']") WebElement txtSearchBar;
	@FindBy(xpath="//i[@class='fa fa-search']") WebElement btnSearch;
	@FindBy(xpath="//a[text()='View Product']") WebElement btnViewProduct;
	
	
	
	//action method
	
	public void clickOnProductLinks() 
	{
		linkProducts.click();
	}
	
	public void productSearch(String product) 
	{
		txtSearchBar.sendKeys(product);
	}
	
	public void clickOnSearchBtn() 
	{
		btnSearch.click();
	}
	
	public void clickOnViewProductBtn() 
	{
		btnViewProduct.click();	
	}
	
}
