import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
	
	

	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	// System.setProperty("webdriver.chrome.driver","C:\\Data\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	    String driverPath = "C:\\Data\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }

}
