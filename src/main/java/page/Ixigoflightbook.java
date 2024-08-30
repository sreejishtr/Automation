package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ixigoflightbook {

	public  WebDriver driver;

	
	
	@FindBy (xpath="/html/body/div[3]/div[1]/div/div[2]/div[2]/button")
	WebElement login;
	
	@FindBy (xpath="//*[@id=\"portal-root\"]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div[3]/input")
	WebElement mobilenumber;
	

	@FindBy (xpath="//*[@id=\"password\"]")
	WebElement pass;
	
	@FindBy (xpath="//*[@id=\"login\"]/div/div[1]/div/div[2]/form/div[2]/button")
	WebElement signup;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[2]/div[1]/div/div/div[2]/div/div[1]/button/span")
	WebElement element; 
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[2]/a")
	WebElement flight;
	
	@FindBy(xpath="//*[@id=\"onewaytrip\"]/a")
	WebElement onewaytrip;
	
	@FindBy(xpath="//*[@id=\"departsfrom-div\"]/input[1]")
	WebElement departure;
	
	@FindBy(xpath="//*[@id=\"arrivesat-div\"]/input[1]")
	WebElement arrival;
	
	@FindBy(xpath="//*[@id=\"departCalendar\"]")
	WebElement departuredate;
	
	@FindBy(xpath="//*[@id=\"custom_menu\"]/div[8]")
	WebElement month;
	
	@FindBy (xpath="//*[@id=\"datepicker\"]/div/table/tbody/tr/td/a")
	List  <WebElement> dates;
	
	@FindBy(xpath="//*[@id=\"pb-searchflight\"]")
	WebElement searchflights;
	
	@FindBy(xpath="/html/body/section/section/div/section/section/div[2]/div/div/section/section/div[1]/section/section/span[2]/div/div/section/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div[1]/div")
	WebElement flightselect;
	
	@FindBy (xpath="//*[@id=\"w9\"]/span")
	WebElement continue1;
	
	@FindBy(xpath="//*[@id=\"w26\"]/span")
	WebElement continue2;
	
	@FindBy (xpath="//*[@id=\"service-desc-SIT\"]/img")
	WebElement seats;
	
	@FindBy (xpath="//*[@id=\"seat1A\"]")
	WebElement seatselect; 
	
	@FindBy(xpath="//*[@id=\"s35\"]/div/div/button/span")
	WebElement confirm;
	
	@FindBy (xpath="//*[@id=\"w10\"]")
	WebElement continue3;
	
	public Ixigoflightbook(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void Ixigoflightbook1 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email,String password)
	{
		
		pass.sendKeys(password);
	}
	public void loginbutton()
	{
		login.click();
	}
	
	public void mousehover()
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
		act.perform();			
	}
	
	public void flight()
	{
		flight.click();
	}
	public void oneway()
	{
		onewaytrip.click();
	}
	
	
	public void departureplace() throws InterruptedException
	{
		Thread.sleep(3000);
		departure.sendKeys("kochi");
		Actions act=new Actions(driver);
		act.sendKeys(departure,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.perform();
	}
	
	public void arrrivalplace() throws InterruptedException
	{
		Thread.sleep(3000);
		arrival.sendKeys("mumbai");
		Actions act=new Actions(driver);
		act.sendKeys(arrival,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.perform();
	}
	
	public void departcalendar () throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(departuredate));
		
		
	}
	
	public void monthclick()
	{
		month.click();
	}
	
	
	public void calendar() throws InterruptedException
	{
		Thread.sleep(3000);
		
		
		for (WebElement date:dates)
		{
			String datedetails=date.getText();
			System.out.println(datedetails);
			if (datedetails.contains("5"))
				{
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(date));
				date.click();
				break;
				}
		}
		
	}
	public void searchflight()
	{
		searchflights.click();
	}
	
	
	public void flightselect()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(flightselect));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", flightselect);
		
		flightselect.click();
	}
	 public void continue1()
	 {

			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(continue1));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", continue1);
			
		     continue1.click();
	 }
	 public void continue2()
	 {
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
		 wait.until(ExpectedConditions.elementToBeClickable(continue2));
		 

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", continue2);
			
		 continue2.click();
	 }
	 public void seats()
	 {
		 seats.click();
	 } 
	 public void seatselect()
	 {
		 seatselect.click();
	 }
	 public void confirm()
	 {
		 confirm.click();
	 }
	 public void continue3()
	 {

		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
		 wait.until(ExpectedConditions.elementToBeClickable(continue3));
		 

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", continue3);
		    continue3.click();
	 }


}
