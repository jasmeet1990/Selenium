package SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../SeleniumSessions/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	WebElement firstName = driver.findElement(By.cssSelector("input#u_0_m"));
	firstName.sendKeys("Jasmeet");
	WebElement lastName = driver.findElement(By.cssSelector("input#u_0_o"));
	lastName.sendKeys("Chadha");
	WebElement mobileNo = driver.findElement(By.cssSelector("input[id='u_0_r']"));
	mobileNo.sendKeys("7973845411");
	WebElement password = driver.findElement(By.cssSelector("input[id='password_step_input']"));
	password.sendKeys("Testing@11");
	


	}

}
