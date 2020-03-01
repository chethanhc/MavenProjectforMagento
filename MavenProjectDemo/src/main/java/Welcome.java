import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome 
{
	WebDriver driver;
	By Myacct=By.xpath("//a[text()='My Account']");
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnMyAccount()
	{
		driver.findElement(Myacct).click();
	}

}
