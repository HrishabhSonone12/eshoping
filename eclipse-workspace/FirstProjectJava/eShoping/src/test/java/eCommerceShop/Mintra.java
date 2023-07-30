package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mintra {
  @Test
  public void MintraShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening MintraShop", true);
	  driver.get("https://www.myntra.com/");
	  Thread.sleep(6000);
	  driver.close();
  }
}
