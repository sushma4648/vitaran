package Echno_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blazedemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//d.manage().window().maximize();

			d.get("https://blazedemo.com/");
			String u=d.getCurrentUrl(); // gets url 
			System.out.println(u);
			
			String b=d.getTitle(); // gets title of the page
			System.out.println(b); 
			
			Thread.sleep(1000);
			
		List<WebElement> link= d.findElements(By.tagName("a"));
		for (WebElement s:link)
		{
			System.out.println("the link name is:"+s.getText());
		}
	}
}
