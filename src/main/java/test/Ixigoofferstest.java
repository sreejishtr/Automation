package test;

import org.testng.annotations.Test;

import base.Ixigobase;
import page.Ixigooffers;



public class Ixigoofferstest extends Ixigobase {
	@Test
	public void offers() throws InterruptedException 
	{
		
	  Ixigooffers ob= new Ixigooffers(driver);
	  
	  ob.login("sajinputhiri@gmail.com", "Sajinjp@1106");
	  ob.loginbutton();
	  ob.clubvistarahover();
	  ob.currentoffers();
	  ob.viewalloffers();
	  ob.scroll();
	

}

}
