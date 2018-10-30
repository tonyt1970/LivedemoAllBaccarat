


import java.util.Set;
import java.util.concurrent.TimeUnit;
public class LivedemoAllBaccarat {

	static String actualTitle;
	static String button;
	static String pTitle;
	static String aCreated;
	static String fName = "anthory_qa";
	static String passWord = "Extreme.1";
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aroberts\\Documents\\Selenium\\chromedriver.exe");

// Initialise browser
WebDriver driver=new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 100);
driver.get("chrome://settings/clearBrowserData");
driver.manage().deleteAllCookies();
driver.manage().window().maximize();


// Maximise browser
driver.manage().window().maximize();

// Open URL
driver.get("https://livedemo.extremelivegaming.com/portal/");

//Login #header-search > input[type="password"]
driver.findElement(By.xpath("//*[@id=\'header-search\']/input")).click();
driver.findElement(By.xpath("//*[@id=\'header-search\']/input")).sendKeys(fName);
driver.findElement(By.cssSelector("#header-search > input[type=\'password\']")).click();
driver.findElement(By.cssSelector("#header-search > input[type=\'password\']")).sendKeys(passWord);
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td/input")).click();

//Portal page
String handle = driver.getWindowHandle();
System.out.println(handle);
driver.switchTo().frame("content");
driver.findElement(By.cssSelector("#DESKTOP > div.buttons > div > button > img")).click();
Set handles = driver.getWindowHandles();
System.out.println(handles);
	for (String handle1 : driver.getWindowHandles()) {
		System.out.println(handle1);
		driver.switchTo().window(handle1);
	}
	// Maximise browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//*[@id=\"xlglobby\"]/div[4]/ul/li[2]/span")).click();
driver.findElement(By.xpath("//*[@id=\"svg-menu-baccarat\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"xlglobby\"]/div[3]/div[2]/ul/li[1]/div/div[1]/div/img")).click();
driver.findElement(By.cssSelector("#xlglobby > div.xlglobby_games.scrollbarbox > div.viewport > ul > li:nth-child(1) > div > div.game_image > div > img")).click();
//driver.findElement(By.xpath("//*[@id=\"xlglobby\"]/div[3]/div[2]/ul/li[1]/div/div/div[2]/img")).click();

//Classic Baccarat
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));
driver.findElement(By.xpath("//*[@id=\"bs_banker\"]")).click();

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "BETS ACCEPTED"));

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));
driver.findElement(By.xpath("//*[@id=\"bs_player\"]")).click();

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "BETS ACCEPTED"));

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));

driver.findElement(By.xpath("//*[@id=\"sideRightDiv\"]/div[1]/div[1]/span")).click();

//Grande Punto Baccarat
driver.findElement(By.xpath("//*[@id=\"xlglobby\"]/div[3]/div[2]/ul/li[2]/div/div[1]/div/img")).click();

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));
driver.findElement(By.xpath("//*[@id=\"bs_four\"]")).click();
driver.findElement(By.xpath("//*[@id=\"bs_five\"]")).click();
driver.findElement(By.xpath("//*[@id=\"bs_six\"]")).click();
driver.findElement(By.xpath("//*[@id=\"bs_seven\"]")).click();
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "BETS ACCEPTED"));

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));

driver.findElement(By.xpath("//*[@id=\"sideRightDiv\"]/div[1]/div[1]/span")).click();

//super 6 baccarat
driver.findElement(By.xpath("//*[@id=\"xlglobby\"]/div[3]/div[2]/ul/li[3]/div/div[1]/div/img")).click();

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));
driver.findElement(By.xpath("//*[@id=\"bs_banker\"]")).click();
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "BETS ACCEPTED"));

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"sideRightDiv\"]/div[2]/div[2]"), "PLEASE PLACE YOUR BETS"));


driver.close();

//driver.switchTo().window(handle);

driver.close();

((WebDriver) driver.manage().window()).close();
//driver.findElement(By.xpath("//*[@id=\"header\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"logoutBtn\"]")).click();
//driver.findElement(By.cssSelector("#logoutBtn")).click();

driver.close();

//driver.close();

//driver.switchTo().window(handle);

//driver.close();
//driver.findElement(By.xpath("//*[@id=\"logoutBtn\"]")).click();
//driver.findElement(By.cssSelector("#logoutBtn")).click();

//driver.close();
//driver.close();


}
}