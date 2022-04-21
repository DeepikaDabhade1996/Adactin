package FinalProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Adactin 
{
  WebDriver driver;
  @Test
  public void Hello() throws InterruptedException 
  {

		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	  //  WebDriver driver=new FirefoxDriver();
		//driver.get("https://adactinhotelapp.com/");
		
	// login invalid username and valid password  1
	  
		driver.findElement(By.id("username")).sendKeys("Deepika");
		driver.findElement(By.id("password")).sendKeys("Water@123");
		driver.findElement(By.id("login")).click();
		// login valid username and invalid password  2
		 
		driver.findElement(By.id("username")).sendKeys("DeepikaDabhade");
		driver.findElement(By.id("password")).sendKeys("Deepika");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		// login invalid username and password   3
		driver.findElement(By.id("username")).sendKeys("Dabhade");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("@123");
		Thread.sleep(2000);

		driver.findElement(By.id("login")).click();	
		Thread.sleep(2000);

		//Thread.sleep(2000);
		
		// login valid page   4
	            
		driver.findElement(By.id("username")).sendKeys("DeepikaDabhade");
		Thread.sleep(2000);
      driver.findElement(By.id("password")).sendKeys("Water@123");
      Thread.sleep(2000);
      driver.findElement(By.id("login")).click();
	    Thread.sleep(2000);

		
		
		   // change password
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click();  // click on change password
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[5]/td[2]/label/input")).sendKeys("tquser1234");// current password
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/label/input")).sendKeys("akashjav9"); // new password
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/label/input")).sendKeys("akashjav9");  // confirm password
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/input")).click();  // click on submit
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();  // click on logout
		//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();  // click on login again
		//driver.findElement(By.id("username")).sendKeys("tquser123");
		//driver.findElement(By.id("password")).sendKeys("akashjav9");
		//driver.findElement(By.id("login")).click();
		
		   //5
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		Thread.sleep(2000);
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		Thread.sleep(2000);
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		Thread.sleep(2000);
		driver.findElement(By.id("room_nos")).sendKeys("1-One");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
      Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("2-Two");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();
		Thread.sleep(2000);// search
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[2]")).click();// cancel
		  //6
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		Thread.sleep(2000);
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		Thread.sleep(2000);
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		Thread.sleep(2000);
		driver.findElement(By.id("room_nos")).sendKeys("1-One");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("5-Five");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();// search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[2]")).click();// cancel
		Thread.sleep(2000);
		//7
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		Thread.sleep(2000);
      driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
      Thread.sleep(2000);
      driver.findElement(By.id("room_type")).sendKeys("Standard");
      Thread.sleep(2000);
      driver.findElement(By.id("room_nos")).sendKeys("1-One");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("1-One");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();// search
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();
      Thread.sleep(2000);
     //  select button
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[1]")).click();
		Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[12]/td[2]/input")).sendKeys("Deepika");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[13]/td[2]/input")).sendKeys("Dabhade");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea")).sendKeys("563,Tilak road,vaijapur");
      Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("1234567845694569");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[16]/td[2]/select")).sendKeys("Master Card");
		Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[1]")).sendKeys("March");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[2]")).sendKeys("2021");
      Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[18]/td[2]/input")).sendKeys("897");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[1]")).click();
		Thread.sleep(2000);
      // book now 
	   driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();  // logout
	   Thread.sleep(2000);
	   String expectedTitle="Adactin";
	   String actualTitle1=driver.getTitle();
	   System.out.println(expectedTitle);
	   if(actualTitle1.equals(expectedTitle))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
	   }


  @BeforeMethod
	  public void login_TestCase(){
	  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	  }

  @AfterMethod
  public void Logout()
  {
	  driver.close();
  }
  }
