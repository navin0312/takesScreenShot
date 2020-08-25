package test;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeLoginPage;
import pom.POMActitmeCustomerPage;

@Listeners(generics.Utility.class)
public class TESTActitimeCustomer extends BaseTest
{
	@Test
	public void customer() throws IOException, Exception
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitmeCustomerPage customer=new POMActitmeCustomerPage(driver);
		customer.createCustomerMethod();
	}	
}