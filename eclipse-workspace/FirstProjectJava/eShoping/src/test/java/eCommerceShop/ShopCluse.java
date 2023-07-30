package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShopCluse {
  @Test
  public void ShopCluseShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening ShopCluse", true);
	  driver.get("https://www.shopclues.com/");
	  Thread.sleep(6000);
	  driver.close();
  }
}
