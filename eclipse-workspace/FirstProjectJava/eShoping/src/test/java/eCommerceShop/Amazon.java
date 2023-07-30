package eCommerceShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonShop() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  Reporter.log("Opening AmazonShop", true);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(6000);
	  driver.close();
  } 
}
