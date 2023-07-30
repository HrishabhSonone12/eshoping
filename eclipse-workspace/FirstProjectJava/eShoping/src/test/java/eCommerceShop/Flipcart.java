package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void FlipkartShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening FlipkartShop", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(6000);
	  driver.close();
  }
}
