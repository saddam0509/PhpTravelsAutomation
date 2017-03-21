import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Testing/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://phptravels.net/login");
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[1]/input")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[2]/input")).sendKeys("demouser");
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/button")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/a/img")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='citiesInput']")).sendKeys("Dhaka");
		driver.findElement(By.xpath(".//*[@id='dpd2']/div/input")).sendKeys("03/26/2017");
		driver.findElement(By.xpath(".//*[@id='EXPEDIA']/div/form/div[6]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[5]/div[3]/div/table/tbody/tr[1]/td/div/div[2]/div/div[1]/a/button")).click();
		

	}

}
