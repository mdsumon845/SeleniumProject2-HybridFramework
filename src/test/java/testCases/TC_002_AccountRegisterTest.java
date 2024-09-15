package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUpPage;
import testBase.BaseClass;

public class TC_002_AccountRegisterTest extends BaseClass{

	@Test(priority=1,groups= {"Sanity","Regression","Master"})
	
	public void verifySignUp() 
	{
		logger.info("***verify Signup has Started...");
		try 
		{
			HomePage hp=new HomePage(driver);
			hp.clickSignupLogin();
			hp.setName(fullName());
			hp.setEmail(email()+"@gmail.com");
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
			signup.clickONCreateAccount();
			logger.info("***verifying expected Mgs...");
			boolean expectedMgs=signup.getConfirmationMgs();
			Assert.assertEquals(expectedMgs, true);
		}catch(Exception e) 
		{
			logger.error(("Test is failed")+e.getMessage());
			logger.debug("Debug logs...");
			Assert.fail();
		}
		
		finally 
		{
			logger.info("***verify Signup has finished...");
		}
	}
}
