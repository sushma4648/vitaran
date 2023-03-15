package Echno_Maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;

public class weblogin {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 107\\BlazeDemoAutomation-master\\BlazeDemoAutomation-master\\executables\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//d.manage().window().maximize();
		// Thread.sleep(4000);
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.get("http://15.206.185.75:4003/"); */
		
		
			d.get("http://15.206.185.75:4003/");
			String u=d.getCurrentUrl(); // gets url 
			System.out.println(u);
			
			String b=d.getTitle(); // gets title of the page
			System.out.println(b); 
			
			Thread.sleep(1000);
			d.findElement(By.id(":r0:")).sendKeys("vLive2");
			Thread.sleep(2000);
			d.findElement(By.id(":r1:")).sendKeys("vLive@123");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[5]/button")).click(); // clicks on Continue button
			System.out.println("Continue button is clicked");
			
			// String u=d.getCurrentUrl();
			if(u.equals("http://15.206.185.75:4003/"))
			{
				System.out.println("Test Case Passed");
			}
			else
			{
				System.out.println("Test Case Failed");
			}
			

//	To Add a New Zone
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(6000));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[2]/label"))).click();
						
			System.out.println("Clicked on Zone Mgt");
			Thread.sleep(2000);
						
			WebDriverWait wait1 = new WebDriverWait(d, Duration.ofSeconds(6000));
			wait1.until(ExpectedConditions.elementToBeClickable(By.id(":r2:"))).click(); 
			
			System.out.println("Clicked on State dropdown");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\":r2:\"]")).sendKeys("Gujarat");
			Thread.sleep(4000);
			d.findElement(By.id(":r4:")).sendKeys("New Zone");
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/form/div/div/div[2]/div[2]/div[2]/button")).click(); // clicks on ADD button
			System.out.println("New zone1 is added"); 
			Thread.sleep(8000);
			// To Get the list of zones in Gujarat
			
			d.findElement(By.xpath("//*[@id=\":r5:\"]")).click();
			Thread.sleep(1000);
			d.findElement(By.id(":r5:")).sendKeys("Gujarat");
			System.out.println("Entered the state name as Gujarat"); 
			Thread.sleep(6000);
						//d.findElement(By.xpath("//*[@id=\":r5:\"]")).click();
						//d.findElement(By.xpath("//div[contains(@class,'class=\"MuiTouchRipple-root css-w0pj6f\')]")).click();
			System.out.println("Gujarat State is clicked"); 
			Thread.sleep(4000);
			System.out.println("Zones under gujarat state are displayed");
			
			
			
			//d.findElement(By.xpath("//*[@id=\"SvgjsSvg1001\"]")).click();
			// using id and web Element is used to store the id. searchBox is used to store the object 
		/*findElement() searchBox = d.findElement(By.id(":rc:"));
			searchBox.sendKeys("Zone Mgt");
			
			// searchBox.submit();
			
			// locate 
			d.findElement(By.xpath("//*[@id=\":rc:\"]")).click(); 
			d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div[3]/div/table/tbody/tr[5]/td[3]/span/span/span[1]/input")).click();
			*/
			/*	
			d.findElement(By.cssSelector("#root > div > main > div.RootZoneMgt_container__CaPgY > div.RootZoneMgt_tabs__pWikW > div:nth-child(2) > label");
			d.findElement(By.className("RootZoneMgt_activeTitle__Vcpxl"));
			WebElement e = d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[2]/label"));
			e.click();
			System.out.println("Clicked on Zone Mgt");	
			 //d.findElement(By.className("RootZoneMgt_activeTitle__Vcpxl")).click(); */
	}

			// d.close();
	
	}


