package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void AjioShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening AjioShop", true);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(6000);
	  driver.close();
	  
  }
}
