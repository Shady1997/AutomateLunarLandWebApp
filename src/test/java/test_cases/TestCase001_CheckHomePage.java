package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PageBase;
import pages.ShopPage;

public class TestCase001_CheckHomePage extends TestBase {

	HomePage homePage;
	ShopPage shopPage;
	WebElement element;

	@Test(priority = 2, groups = "smoke", description = "Choose Shop Tob")
	public void ChooseSearchPage() throws InterruptedException {
		homePage = new HomePage(driver);
		shopPage = new ShopPage(driver);

		homePage.chooseShopPage();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=\"overlay jx_ui_Widget\"])[2]")).click();
		Thread.sleep(3000);
		// scroll to view element
		PageBase.scrollToViewElement(driver, element = driver.findElement(By.xpath("//h2[text()='Greeting Card']")));
		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,450)", "");
//		Thread.sleep(4000);
//		WebElement l = driver.findElement(By.xpath("//a[text()='Standard Gift Package']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", l);
//		shopPage.choosestadardPackage();
//		Thread.sleep(3000);
		// take screenshot to Provider page
//		Utility.captureScreenshot(driver, "ProviderPage");
	}

//	@Test(priority = 3, groups = "smoke", description = "Search for Male Doctors")
//	public void searchForDoctor() throws InterruptedException {
//		providersPage = new ProvidersPage(driver);
//		providersPage.searchField();
//		// take screenshot to Provider page
//		Utility.captureScreenshot(driver, "SearchResult");
//		for (int i = 0; i < 10; i++) {
//			js.executeScript("window.scrollBy(0,250)", "");
//			Thread.sleep(2000);
//		}
//		providersPage.requestAppointment();
//		Thread.sleep(5000);
//	}
//
//	@Test(priority = 4, groups = "smoke", description = "Fill Patient Data and Reserve Appointment")
//	public void reserveAppointment() throws InterruptedException, AWTException {
//		appointmentPage = new AppointmentPage(driver);
//		// Get all the handles currently available
//		Set<String> handles = driver.getWindowHandles();
//		currentHandle = driver.getWindowHandle();
//		for (String actual : handles) {
//			if (!actual.equalsIgnoreCase(currentHandle)) {
//				// Switch to the opened tab
//				driver.switchTo().window(actual);
//			}
//		}
//		appointmentPage.getFirstName();
//		appointmentPage.getLastName();
//		appointmentPage.getPhoneNumber();
//		appointmentPage.getAltPhoneNumber();
//		js.executeScript("window.scrollBy(0,300)", "");
//		Thread.sleep(9000);
//		appointmentPage.getTimeToCall();
//		appointmentPage.getEmailAddress();
//		appointmentPage.getZipCode();
//		Thread.sleep(3000);
//		appointmentPage.getGender();
//		appointmentPage.getBirthday();
//		appointmentPage.getReason();
//		appointmentPage.getFirstTimeVisist();
//		Thread.sleep(3000);
//		appointmentPage.getIssuanceType();
//		js.executeScript("window.scrollBy(0,400)", "");
//		appointmentPage.getReferringDoctorName();
//		Thread.sleep(2000);
//		appointmentPage.getToSeeDoctorName();
//		Thread.sleep(3000);
////		js.executeScript("var tempElement=document.getElementsByClassName('recaptcha-checkbox-border');tempElement[0].click();",null);
//		r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		appointmentPage.getSubmitButton();
//		Thread.sleep(9000);
//	}
}
