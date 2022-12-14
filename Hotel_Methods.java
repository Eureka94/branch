package project.com;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hotel_Methods {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		UN.sendKeys("eureka1994");
		WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
		PWD.sendKeys("KayalMS@20");
		screenshot("login page");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		WebElement Loc = driver.findElement(By.xpath("//select[@id='location']"));
		click(Loc);
		down();
		enter();
		WebElement Hot = driver.findElement(By.xpath("//select[@id='hotels']"));
		click(Hot);
		down();
		down();
		enter();
		WebElement RT = driver.findElement(By.xpath("//select[@id='room_type']"));
		click(RT);
		down();
		down();
		down();
		enter();
		WebElement NR = driver.findElement(By.xpath("//select[@id='room_nos']"));
		click(NR);
		down();
		enter();
		WebElement date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date.sendKeys("28/11/2022");
		WebElement date2 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		date2.sendKeys("30/11/2022");
		WebElement AR = driver.findElement(By.xpath("//select[@id='adult_room']"));
		click(AR);
		down();
		enter();
		WebElement CR = driver.findElement(By.xpath("//select[@id='child_room']"));
		click(CR);
		down();
		enter();
		screenshot("Hotel Room Booking");
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		click(submit);
		WebElement but = driver.findElement(By.xpath("//input[@type='radio']"));
		click(but);
		screenshot("confirmation page");
		WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
		click(con);
		WebElement FN = driver.findElement(By.xpath("//input[@id='first_name']"));
		FN.sendKeys("Eureka");
		WebElement LN = driver.findElement(By.xpath("//input[@id='last_name']"));
		LN.sendKeys("S");
		WebElement addr = driver.findElement(By.xpath("//textarea[@id='address']"));
		addr.sendKeys("3/121,vedasanthur,dgl");
		WebElement CN = driver.findElement(By.xpath("//input[@id='cc_num']"));
		CN.sendKeys("1234567898765432");
		WebElement CT = driver.findElement(By.xpath("//select[@id='cc_type']"));
		click(CT);
		down();
		down();
		enter();
		WebElement ED = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		click(ED);
		down();
		down();
		enter();
		WebElement EY = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		click(EY);
		down();
		down();
		enter();
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("678");
		WebElement BN = driver.findElement(By.xpath("//input[@id='book_now']"));
		click(BN);
		screenshot("Book the hotel");
		WebElement MI = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		click(MI);
		WebElement CB = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		click(CB);
		screenshot("Changes in any Booking");
		WebElement CS = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		click(CS);
	}

	public static void click(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void screenshot(String name) throws IOException {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src = ts1.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\screenshot\\" + name + ".png");

		FileUtils.copyFile(src, des);

	}

}
