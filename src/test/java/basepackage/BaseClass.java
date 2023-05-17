package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void sleep(int sleep) throws InterruptedException {
		Thread.sleep(sleep);
	}

	public static WebElement findingElement(By by) {
		WebElement findedElement = driver.findElement(by);
		return findedElement;
	}

	public static void sendingInput(WebElement element, String inputData) {
		element.sendKeys(inputData);
	}

	public static WebElement searchElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement searchElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void submit(WebElement element) {
		element.submit();
	}

	public static void select(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void action(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File indriver = ts.getScreenshotAs(OutputType.FILE);
		File to_eclipse = new File(location);
		FileHandler.copy(indriver, to_eclipse);
	}

	public static String excelRead(String Location, int RowNo, int CellNo) throws IOException {

		File f = new File(Location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(RowNo);
		Cell cell = row.getCell(CellNo);
		String value = cell.toString();
		return value;
	}

	public static String readProperty(String location, String key) throws IOException {
		File file = new File(location);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static void excelReading(String Location, int SheetNo, int RowNo, int CellNo) throws IOException {

		File f = new File(Location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(SheetNo);
		Row row = sheet.getRow(RowNo);
		Cell cell = row.getCell(CellNo);
		CellType cellType = cell.getCellType();
		if (cellType == CellType.STRING) {

			String Stringvalue = cell.getStringCellValue();
			System.out.println(Stringvalue);

		} else if (cellType == CellType.NUMERIC) { // It can be a date or else Numeric value

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateValue = cell.getDateCellValue();
				System.out.println(dateValue);

			} else {

				double numericValue = cell.getNumericCellValue();
				long numberValue = (long) numericValue;
				System.out.println(numberValue);
			}

		}

	}

}
