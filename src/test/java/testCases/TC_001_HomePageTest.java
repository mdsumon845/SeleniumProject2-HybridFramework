package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_HomePageTest  extends BaseClass{

	@Test(priority=1,groups={"Sanity","Master"})
	public void verifyLogoIsDisplayed() 
	{
		logger.info("***Logo display verify has Started...");
		try 
		{
			HomePage hp=new HomePage(driver);
			boolean expectedLogo=hp.displayLogo();
			Assert.assertEquals(expectedLogo, true);
		}catch(Exception e) 
		{
			logger.error(("Test is failed")+e.getMessage());
			logger.debug("Debug logs...");
			Assert.fail();
		}
		
		finally 
		{
			logger.info("***Logo display verify has finished...");
		}
		
	}
	
}
