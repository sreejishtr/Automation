package test;


import org.testng.annotations.Test;

import base.Ixigobase;
import page.Ixigoflightbook;

public class Ixigoflightbooktest extends Ixigobase{
	@Test
	public void flightbook() throws InterruptedException
	{
		Ixigoflightbook ob=new Ixigoflightbook(driver);
		Thread.sleep(3000);
		ob.login("7012717611","sajinputhiri@gmail.com");
		ob.loginbutton();
		Thread.sleep(3000);
		ob.mousehover();
		ob.flight();
		ob.oneway();
		ob.departureplace();
		ob.arrrivalplace();
		ob.departcalendar();
		ob.monthclick();
		ob.calendar();
		ob.searchflight();
		ob.flightselect();
		ob.continue1();
		ob.continue2();
		ob.seats();
		ob.seatselect();
		ob.confirm();
		ob.continue3();
		
	}

}