package org.example;

import org.openqa.selenium.By;

public final class JUnitLocators {


	//Test Case 1
	public final static By contactUsBtn = By.xpath("//a[@href=\"#contact_form_pop\"]");
	public final static By contactPopUp = By.xpath("//div[(@id='contact_form_pop')]");
	public final static By contactSubjectInput = By.xpath("//input[(@id='cf-4')]");
	public final static By contactMessageInput = By.xpath("//textarea[(@id='cf-5')]");
	public final static By contactSubmitBtn = By.xpath("//input[contains(@class,'btn-cf-submit')]");

	
	//TestCase 2
	public final static By company = By.xpath("//ul[(@id='menu-main-nav-1')]//a[@href=\"https://www.musala.com/company/\"]");
	public final static String companyUrl = "https://www.musala.com/company/";
	public final static By leadership = By.xpath("//section[(@class='company-members')]");
	public final static By cookiesBtn = By.xpath("//*[@id=\"cookie-law-info-bar\"]/span/div/div");
	public final static By facebookLink = By.xpath("//div[(@class='links-buttons')]//a[@href=\"https://www.facebook.com/MusalaSoft?fref=ts\"]");
	public final static String facebookUrl = "https://www.facebook.com/MusalaSoft?fref=ts";
	public final static By facebookCookiesAcceptBtn = By.xpath("//*[@id=\"facebook\"]/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]");
	public final static By facebookPortrait = By.xpath("//a[@href=\"https://www.facebook.com/MusalaSoft/photos/a.152166551470703/3926723730681614/?__tn__=%3C\"]");
	public final static By facebookPortrait1 = By.xpath("//a[@href=\"https://www.facebook.com/MusalaSoft/photos/a.152166551470703/3926723730681614\"]");
	public final static String musalaProfileImgUrl = "https://www.facebook.com/MusalaSoft/photos/a.152166551470703/3926723730681614/";
	
	//TestCase 3
	public final static By careers = By.xpath("//ul[(@id='menu-main-nav-1')]//a[@href=\"https://www.musala.com/careers/\"]");
	public final static By openPositions = By.xpath("//span[contains(text(), \"Check our open position\")]");
	public final static String joinUsUrl = "https://www.musala.com/careers/join-us/";
	public final static By jobLocationDropDown = By.xpath("//select[(@id=\"get_location\")]");
	public final static String anywhereUrl = "https://www.musala.com/careers/join-us/?location=Anywhere";
	public final static By qaEngeeringOpenPosition = By.xpath("//h2[contains(text(),\"QA Engineer\")]");
	public final static By descriptionSection = By.xpath("//h2[contains(text(),\"General description\")]");
	public final static By requirementSection = By.xpath("//h2[contains(text(),\"Requirements\")]");
	public final static By responsibilitiesSection = By.xpath("//h2[contains(text(),\"Responsibilities\")]");
	public final static By whatWeOfferSection = By.xpath("//h2[contains(text(),\"What we offer\")]");
	public final static By applyBtn = By.xpath("//input[@value='Apply']");
	public final static By nameInput = By.xpath("//input[@name='your-name']");
	public final static By emailInput = By.xpath("//input[@name='your-email']");
	public final static By mobileNumbInput = By.xpath("//input[@name='mobile-number']");
	public final static By cvUpload = By.xpath("//div[(@class='uploadCV')]//input[@name='upload-cv']");
	public final static By btn =By.xpath("//input[@id='adConsentChx']");
	public final static By sendBtn = By.xpath("//input[@value='Send']");


	//Test case 4
	public final static By forEveryPosition =  By.xpath(".//h2[(@class='card-jobsHot__title')]");
	public final static By forEverySection = By.xpath(".//article[(@class='card-jobsHot')]");

}
