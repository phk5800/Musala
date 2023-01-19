package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.example.JUnitLocators.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)
public class Tests extends TestsBaseClass {

    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvFileSource(files = dataCsvPath, useHeadersInDisplayName = true)
    public void TestCase1(String name, String email) {
        BaseClass obj = new BaseClass(driver);
        obj.clickElementBy(cookiesBtn);
        obj.clickElementBy(contactUsBtn);
        obj.checkElementIsVisible(contactPopUp);
        obj.writeTextInElement(name, nameInput);
        obj.writeTextInElement(email, emailInput);
        obj.writeTextInElement("test test", contactSubjectInput);
        obj.writeTextInElement("TestQA", contactMessageInput);
        obj.clickElementBy(contactSubmitBtn);
        obj.validationErrorMessage(emailInput);

    }

    @Test
    public void TestCase2() {
        BaseClass obj = new BaseClass(driver);
        obj.clickElementBy(company);
        obj.checkUrl(companyUrl);
        obj.checkElementIsDisplayed(leadership);
        obj.clickIfVisible(cookiesBtn);
        obj.clickIfVisible(facebookLink);
        obj.switchToTab();
        obj.checkUrl(facebookUrl);
        obj.acceptCookiesFacebook();
        obj.selectFacebookPortrait();
        obj.checkMusalaPortrait();
    }

    @Test
    public void TestCase3() {
        BaseClass obj = new BaseClass(driver);
        //Change the Url with yours own CV position URL
        String cvUrl = "C:\\Users\\polsu\\Desktop\\Selenium_project\\src\\main\\resources\\my-cv.pdf";

        obj.clickElementBy(careers);
        obj.clickElementBy(openPositions);
        obj.checkUrl(joinUsUrl);
        obj.selectTextFromDropDown("Anywhere", jobLocationDropDown);
        obj.checkUrl(anywhereUrl);
        obj.clickElementBy(cookiesBtn);
        obj.clickElementBy(qaEngeeringOpenPosition);
        obj.checkElementIsVisible(descriptionSection);
        obj.checkElementIsVisible(requirementSection);
        obj.checkElementIsVisible(responsibilitiesSection);
        obj.checkElementIsVisible(whatWeOfferSection);
        obj.clickElementBy(cookiesBtn);
        obj.clickElementBy(applyBtn);
        obj.writeTextInElement("", nameInput);
        obj.writeTextInElement("Email@mail", emailInput);
        obj.writeTextInElement("0990", mobileNumbInput);
        obj.writeTextInElement(cvUrl, cvUpload);
        obj.clickElementBy(btn);
        obj.clickElementBy(sendBtn);
        obj.validationErrorMessage(nameInput);
        obj.validationErrorMessage(emailInput);
    }

    @Test
    public void TestCase4() {
        BaseClass obj = new BaseClass(driver);
        obj.clickElementBy(careers);
        obj.clickElementBy(openPositions);
        obj.checkUrl(joinUsUrl);
        obj.selectTextFromDropDown("Sofia", jobLocationDropDown);
        obj.cityOpenPosition("Sofia", forEverySection, forEveryPosition);
        System.out.println("-------------------------------");
        obj.selectTextFromDropDown("Skopje", jobLocationDropDown);
        obj.cityOpenPosition("Skopje", forEverySection, forEveryPosition);
    }
}
