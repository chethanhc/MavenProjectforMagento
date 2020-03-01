import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void testcase1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login L=new Login(driver);
		L.typeEmail("kcpkaranth@gmail.com");
		L.typePass("welcome#123");
		L.clickOnLogin();
		Home H=new Home(driver);
		H.clickOnLogout();
		driver.quit();
		
		
		

	}

}
