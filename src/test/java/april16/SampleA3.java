package april16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA3 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select skillDropDown = new Select(driver.findElement(By.xpath("//select [@placeholder='Month']")));
		
		skillDropDown.selectByValue("May");
		 

	}

}
