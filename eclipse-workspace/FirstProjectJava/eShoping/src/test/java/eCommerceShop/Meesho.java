package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void MeeshoShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening MeeshoShop", true);
	  driver.get("https://www.meesho.com/");
	  Thread.sleep(6000);
	  driver.close();
  }
}
