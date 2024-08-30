package page;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ixigooffers {
 
	public WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"flyerid\"]")
	WebElement mail;

	@FindBy (xpath="//*[@id=\"password\"]")
	WebElement pass;
	
	@FindBy (xpath="//*[@id=\"login\"]/div/div[1]/div/div[2]/form/div[2]/button")
	WebElement login;
	

    
    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[1]/div/div[1]/div[5]/a")
    WebElement currentoffers;
    
    @FindBy (xpath="//*[@id=\"normal\"]")
    WebElement viewalloffers;
    
    public Ixigooffers (WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void login(String email,String password)
	{
    	try {
		mail.sendKeys(email);
		pass.sendKeys(password);
    	}
    	catch (StaleElementReferenceException e)
    	{
    		mail.sendKeys(email);
    		pass.sendKeys(password);
    	}
	}
	public void loginbutton()
	{
		login.click();
	}
	
    
    public void Ixigohover()
    {
    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
     	wait.until(ExpectedConditions.elementToBeClickable(ixigo));
     	
    	Actions act =new Actions(driver);
    	act.moveToElement(ixigo);
    	act.perform();
    }
    
    public void currentoffers() throws InterruptedException
    {
    	Thread.sleep(3000);
    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
     	wait.until(ExpectedConditions.elementToBeClickable(currentoffers));
     	
    	currentoffers.click();
    }
     
    public void viewalloffers()
    {
    	
    	try
    	{
    		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
	     	wait.until(ExpectedConditions.elementToBeClickable(viewalloffers));
		
	        JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView();", viewalloffers);
            
		    viewalloffers.click();
		   
    	}
    	catch (StaleElementReferenceException e)
    	{
    		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
	     	wait.until(ExpectedConditions.elementToBeClickable(viewalloffers));
		
	        JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView();", viewalloffers);
            
		    viewalloffers.click();
    	}
		
	
    }
    
    public void scroll()
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,700)", "");
    	
    }

}
