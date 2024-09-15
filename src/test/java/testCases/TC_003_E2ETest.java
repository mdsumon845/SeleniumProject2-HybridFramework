package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ShoppingCartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.OrderCongratulationsPage;
import pageObjects.PaymentPage;
import pageObjects.ProductDetailsPage;
import pageObjects.ProductPage;
import pageObjects.SignUpPage;
import testBase.BaseClass;

public class TC_003_E2ETest extends BaseClass{

	@Test(priority=1,groups= {"Sanity","master","Regression","E2E"})
	
	public void verifyE2Etesting() throws Exception
	{
		logger.info("***E2E test has started...");
		try 
		{
			
			logger.info("***E2E verify has started from Home page...");
			HomePage hp=new HomePage(driver);
			hp.clickSignupLogin();
			hp.setName(fullName());
			hp.setEmail(email()+"@gmail.com");
			logger.info("***clickOn SignupBtn in Home page...");
			hp.clickOnSignupBtn();
			logger.info("***fillout Signup page...");
			SignUpPage signup=new SignUpPage(driver);
			signup.selectTitle();
			signup.setPassword(pwd());
			signup.selectDay();
			signup.selectMonth();
			signup.selectYear();
			signup.selectNewsletter();
			signup.setFirstName(firstname());
			signup.setLastName(lastName());
			signup.setCompanyName(CompanyName());
			signup.setAddress1(Address1());
			signup.setAddress2(Address2());
			signup.selectCountry();
			signup.setState(state());
			signup.setCity(city());
			signup.setZipCode(zipCode());
			signup.setMobileNumber(mobileNUm());
			logger.info("***Click on Create account page...");
			signup.clickONCreateAccount();
			logger.info("***verifying expected Mgs...");
			boolean expectedMgs=signup.getConfirmationMgs();
			Assert.assertEquals(expectedMgs, true);
			logger.info("***Product page...");
			ProductPage pp=new ProductPage(driver);
			pp.clickOnProductLinks();
			logger.info("***Product search ...");
			pp.productSearch(p.getProperty("productSearch"));
			pp.clickOnSearchBtn();
			Thread.sleep(2000);
			pp.clickOnViewProductBtn();
			logger.info("***Product details page...");
			ProductDetailsPage pdp=new ProductDetailsPage(driver);
			pdp.clickItemsToNavigateToCart();
//			logger.info("***verifying confirmation Mgs...");
//			boolean confirmationMgs=pdp.productAddingConfirmationMgs();
//			Assert.assertEquals(confirmationMgs, true);
//			Thread.sleep(2000);
			pdp.clickOnViewCartBtn();
			Thread.sleep(3000);
			logger.info("***Product Cart page...");
			ShoppingCartPage cartPage=new ShoppingCartPage(driver);
			String expectedPrice=cartPage.getCartPageProductPrice();
			System.out.println(expectedPrice);
			logger.info("***verifying expected Price...");
			Assert.assertEquals(expectedPrice, "Rs. 400");
			cartPage.clickOnProceedCheckoutBtn();
			logger.info("***verifying total price in checkout page...");
			CheckoutPage checkout=new CheckoutPage(driver);
			String extectedTotalPrice=checkout.getTotalPrice();
			Assert.assertEquals(extectedTotalPrice, "Rs. 400");
			checkout.setComment(comment());
			checkout.clickOnPlaceOderBtn();
			logger.info("***verifying Payment page...");
			PaymentPage payment =new PaymentPage(driver);
			boolean expectedPage=payment.getPaymentPage();
			Assert.assertEquals(expectedPage, true);
			payment.setNameOnCard(cardname());
			payment.setCardNumber(cardNumber());
			payment.setCvc(cvc());
			payment.setExpiryMonth(expiryMonth());
			payment.setExpirYear(expiryYear());
			payment.clickOnPayAndConfirmOrderBtn();
			Thread.sleep(3000);
			logger.info("***verifying Order congratulations page...");
			OrderCongratulationsPage congratulationsPage=new OrderCongratulationsPage(driver);
			boolean expectedConfirmationMgs=congratulationsPage.getOrderConfirmationMessage();
			Assert.assertTrue(expectedConfirmationMgs);
			
				
		}catch(Exception e) 
		{
			logger.error(("Test is failed")+e.getMessage());
			logger.debug("Debug logs...");
			Assert.fail();
		}
		
		finally 
		{
			logger.info("***TC_003_E2E test has finished...");
		}
			
	}
}
