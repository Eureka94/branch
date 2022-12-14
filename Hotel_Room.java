package project.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Room {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		UN.sendKeys("eureka1994");
		WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
		PWD.sendKeys("KayalMS@20");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		WebElement Loc= driver.findElement(By.xpath("//select[@id='location']"));
		Select s=new Select(Loc);
		s.selectByVisibleText("Sydney");
		WebElement Hot= driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2=new Select(Hot);
		s2.selectByValue("Hotel Hervey");
		WebElement RT= driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s3=new Select(RT);
		s3.selectByVisibleText("Super Deluxe");
		WebElement NR= driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4=new Select(NR);
		s4.selectByVisibleText("1 - One");
		WebElement date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date.sendKeys("28/12/2022");
		WebElement date2 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		date2.sendKeys("30/12/2022");
		WebElement AR= driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5=new Select(AR);
		s5.selectByVisibleText("2 - Two");
		WebElement CR= driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s6=new Select(CR);
		s6.selectByVisibleText("1 - One");
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		WebElement but = driver.findElement(By.xpath("//input[@type='radio']"));
		but.click();
		WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
		con.click();
		WebElement FN = driver.findElement(By.xpath("//input[@id='first_name']"));
		FN.sendKeys("Eureka");
		WebElement LN = driver.findElement(By.xpath("//input[@id='last_name']"));
		LN.sendKeys("S");
		WebElement addr = driver.findElement(By.xpath("//textarea[@id='address']"));
		addr.sendKeys("3/121,vedasanthur,dgl");
		WebElement CN = driver.findElement(By.xpath("//input[@id='cc_num']"));
		CN.sendKeys("1234567898765432");
		WebElement CT= driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s7=new Select(CT);
		s7.selectByVisibleText("VISA");
		WebElement ED= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8=new Select(ED);
		s8.selectByVisibleText("September");
		WebElement EY= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9=new Select(EY);
		s9.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("678");
		WebElement BN = driver.findElement(By.xpath("//input[@id='book_now']"));
		BN.click();
		
		
		
		
		
		
		
		
		

	}

}
