package MuMavenProject.Servify360Dasbord;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsumerTab2 {

	 private WebDriver driver;

		public ConsumerTab2(Login360Dashbord login360Dashbord) {
			this.driver = login360Dashbord.getDriver();
		}
	
	
		 @Test 
	      public void ConsumerTab () throws InterruptedException {
	  	      System.out.println("calling consumer tab");
	  		// WebElement  sidebar = driver.findElement(By.className("sidebar-report"));
	  	     //sidebar.click(); 
	  	      driver.findElement(By.className("sidebar-consumers")).click();
	  	      Thread.sleep(4000);
	  	      //WebElement SomthingWEnterong = driver.findElement(By.className("sweet-content"));
	  		  AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://staging.servify.in:3000/consumers");
	  	      WebElement Viewbutton = driver.findElement(By.xpath("html/body/consumer/div[1]/div/div/div[4]/div[1]/table/tbody/tr[2]/td[7]/a/button"));
	  	      Assert.assertNotEquals(Viewbutton, null);
	  	      Thread.sleep(2000);
	  	     
	        }
	           @Test 
	           public void ConsumerViewDetilsButtons  () throws InterruptedException{
	           WebElement Viewbutton =driver.findElement(By.xpath("html/body/consumer/div[1]/div/div/div[4]/div[1]/table/tbody/tr[3]/td[7]/a/button"));
	           Viewbutton.click();
	           WebElement Viewbutton2 =driver.findElement(By.xpath("html/body/div[2]/unified_view_consumer/div/div[2]/div/view_consumer_details/form/div[2]/div[3]/div/div/div[1]/button"));
	           Assert.assertNotEquals(Viewbutton2, null);
	           Thread.sleep(2000);
	           driver.quit();
	           }


}// end 
