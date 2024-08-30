package test;

import org.testng.annotations.Test;

import base.Ixigobase;
import page.Ixigologin;
import utility.Excelhandleixigo;

public class Ixigologintest extends Ixigobase {
	
		
		@Test
		public void logincredentials() 
		{
			
		
	    Ixigologin ob=new Ixigologin(driver);
		
		String excel="C:\\Users\\hp\\Desktop\\Book1.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelhandleixigo.getrowcount(excel, sheet);
		System.out.println("rowcount = "+rowcount);
		
		for (int i=1;i<=rowcount;i++)
		{
			String email=Excelhandleixigo.getcellvalue(excel, sheet, i, 0);
			System.out.println("email = "+email);
			String password=Excelhandleixigo.getcellvalue(excel,sheet,i,1);
			System.out.println("password = "+password);
			
			ob.setvalues(email, password);
			ob.login();
			
			String expected="https://www.ixigo.com/account";
			String actual=driver.getCurrentUrl();
			
			if (actual.equals(expected))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			} 
			//Thread.sleep(3000);
			//driver.navigate().refresh();
			//Thread.sleep(3000);
			ob.clear();
	}	

	}

}
