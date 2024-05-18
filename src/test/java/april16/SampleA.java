package april16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input [@placeholder='First Name']")).sendKeys("Vamsi");
		driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys("Janga");
		
		driver.findElement(By.xpath("//input [@value='Male']")).click();
		driver.findElement(By.xpath("//input [@value='Cricket']")).click();

		driver.findElement(By.xpath("//input [@placeholder='Last Name']")).clear();    
		
				
	}

}
