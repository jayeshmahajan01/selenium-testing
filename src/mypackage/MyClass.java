package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://155.248.242.125:8090/");
		    driver.manage().window().maximize();
			Thread.sleep(3000);
			//User id
			driver.findElement(By.xpath("//html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[1]/div[1]/input")).sendKeys("cosb@yopmail.com");
			
			//Password
			driver.findElement(By.xpath("//html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[2]/div[1]/input")).sendKeys("Admin@1211");
			Thread.sleep(13000);
			
			//check box
			driver.findElement(By.xpath("//html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[5]/input")).click();
			Thread.sleep(3000);
			
			// Sign in button
			driver.findElement(By.xpath("//html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[6]/button[1]/span")).click();
			Thread.sleep(5000);
			
			//Scheme//
			driver.findElement(By.xpath("//html/body/app-root/app-main-template/div/div/app-new-dashboard/app-scheme-modal/p-dialog/div/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(3000);
			
			//Scheme Master//
			driver.findElement(By.xpath("//html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul/li[6]/a/p")).click();
			Thread.sleep(3000);
			
		//Pan Validation
			driver.findElement(By.xpath("//html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul[2]/li[1]/a")).click();
			Thread.sleep(3000);
			
		// Action Button  
			
		    driver.findElement(By.xpath("//html/body/app-root/app-main-template/div/div/app-pan-validation-type/div[2]/div/div/app-global-datatable/p-table/div/div[2]/table/tbody/tr[1]/td[4]/p-splitbutton/div/button[2]")).click();
		    Thread.sleep(3000);
		    
		 //Update 
		    
		    
		    driver.findElement(By.xpath("//html/body/div/p-tieredmenusub/ul/li[1]/a/span")).click();
		    
		   Thread.sleep(3000); 
		   
		   //Close
		   
		   driver.findElement(By.xpath("//html/body/app-root/app-main-template/div/div/app-pan-validation-type/div[2]/div/div/app-global-datatable/app-pan-validation-type-modal/form/p-dialog/div/div/div[1]/div/button")).click();
		   Thread.sleep(3000);
		   
		   //Constitution Master
		   
		   driver.findElement(By.xpath("//div//ul//li//a//img[@src='assets/img/ConstitutionType.svg']")).click();
		   Thread.sleep(3000);
	}
}
