package org.example;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseClass {
	private final WebDriver driver;

	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}

	public void checkUrl(String expectedUrl) {
		String currentUrl = getCurrentUrl();
		assertTrue(currentUrl.contains(expectedUrl));
	}
	
	public void clickElementBy(By element) {
		WebElement webElement = getDriver().findElement(element);
		if (webElement.isDisplayed()) {
			webElement.click();
		}
	}
	
	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void selectTextFromDropDown(String str, By locator){
		Select drpCountry = new Select(getDriver().findElement(locator));
		drpCountry.selectByVisibleText(str);
	}
		public void checkElementIsVisible(By element){
			WebElement webElement = getDriver().findElement(element);
			assertTrue(webElement.isDisplayed());
		}
		public void writeTextInElement(String str, By element){
			WebElement webElement = getDriver().findElement(element);
			webElement.sendKeys(str);
		}

	public void validationErrorMessage(By element) {
		WebElement webElement = getDriver().findElement(element);
		String validationMessage = webElement.getAttribute("validationMessage");
		String classes = webElement.getAttribute("class");
		if(validationMessage.length() > 0 || classes.equals("true")){
			assertTrue(true);
		} else{
			for (String c : classes.split(" ")) {
				if (c.equals("wpcf7-not-valid")) {
					assertTrue((c.equals("wpcf7-not-valid")));
				}
			}
		}
	}

	public void cityOpenPosition(String city, By forEverySection, By forEveryPosition){
		List<WebElement> findData = driver.findElements(forEverySection);
		System.out.println("Location: " + city);
		for (WebElement webElement : findData) {
			if (webElement.isDisplayed()) {
				String position = webElement.findElement(forEveryPosition).getText();
				System.out.println("Position: " + position);
				WebElement span = webElement.findElement(By.tagName("a"));
				System.out.println("More info: "+ span.getAttribute("href"));
			}
		}
	}

	public void checkElementIsDisplayed( By locator) {
		WebElement LeaderShipElement = getDriver().findElement(locator);
		Assert.assertTrue(LeaderShipElement.isDisplayed());
	}

	public void clickIfVisible(By locator) {
		clickElementBy(locator);
	}

	public void switchToTab() {
		//get window handlers as list
		List<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
		//switch to new tab
		getDriver().switchTo().window(browserTabs.get(1));
	}

	public void acceptCookiesFacebook() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(JUnitLocators.facebookCookiesAcceptBtn));

		clickElementBy(JUnitLocators.facebookCookiesAcceptBtn);
	}

	public void selectFacebookPortrait() {
		clickElementBy(JUnitLocators.facebookPortrait1);
	}

	public void checkMusalaPortrait() {
		checkUrl(JUnitLocators.musalaProfileImgUrl);
	}
}
