package com;

import org.openqa.selenium.WebElement;

public class CardDetailsErrorMsg extends BaseClass {
	public void paymentDetails() {
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		implicitWait();
		WebElement txtUsername = LocatorById("email");
		elementSendkeys(txtUsername, "dinesh12596@gmail.com");
		WebElement txtPassword = LocatorById("pass");
		elementSendkeys(txtPassword, "j@9176770513J");
		
		WebElement btnLogin = LocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);
		
		WebElement textWelcome = LocatorByXpath("//a[@data-testid='username']");
		String welcomeText = getText(textWelcome);
		System.out.println(welcomeText);
		
		WebElement btnBookHotel = LocatorByXpath("//a[text()='Book Hotel']");
		elementClick(btnBookHotel);
		
		WebElement ddnState = LocatorById("state");
		selectOptionByVisibleText(ddnState, "Tamil Nadu");
		
		
		WebElement btnSelectCity = LocatorByXpath("//span[text()='Select City *']");
		elementClick(btnSelectCity);
		WebElement btnCityChennai = LocatorByXpath("//li[text()='Chennai']");
		btnCityChennai.click();
				
		WebElement btnSelectRoom = LocatorByXpath("//textarea[@type='search']");
		clickJs(btnSelectRoom);
		
		WebElement btnStandard = LocatorByXpath("//li[text()='Standard']");
		elementClick(btnStandard);
		
		elementClick(btnSelectRoom);
		WebElement btnDeluxe = LocatorByXpath("//li[text()='Deluxe']");
		elementClick(btnDeluxe);
		
		elementClick(btnSelectRoom);
		WebElement btnSuite = LocatorByXpath("//li[text()='Suite']");
		elementClick(btnSuite);

		elementClick(btnSelectRoom);
		WebElement btnLuxury = LocatorByXpath("//li[text()='Luxury']");
		elementClick(btnLuxury);

		elementClick(btnSelectRoom);
		WebElement btnStudio = LocatorByXpath("//li[text()='Studio']");
		elementClick(btnStudio);
		
		WebElement btnCheckIn = LocatorByName("check_in");
		elementClick(btnCheckIn);
		WebElement btnDate;
		btnDate = LocatorByXpath("//a[text()='24']");
		elementClick(btnDate);
		
		WebElement btnCheckOut = LocatorByName("check_out");
		elementClick(btnCheckOut);
		btnDate = LocatorByXpath("//a[text()='26']");
		elementClick(btnDate);
		
		WebElement ddnNoOfRooms = LocatorById("no_rooms");
		selectOptionByIndex(ddnNoOfRooms, 1);
		
		WebElement ddnNoOfAdults = LocatorById("no_adults");
		selectOptionByIndex(ddnNoOfAdults, 2);
		
		WebElement txtNoOfChild = LocatorById("no_child");
		elementSendkeys(txtNoOfChild, "1");
		switchFrameById("hotelsearch_iframe");
		WebElement btnSearch = LocatorById("searchBtn");
		elementClick(btnSearch);
		switchFrameToWindow();
		
		WebElement textSearch = LocatorByXpath("//h5[text()='Select Hotel']");
		String searchText = getText(textSearch);
		System.out.println(searchText);
		
		WebElement textHotelName = LocatorByXpath("//h5[text()='Hyatt Regency Chennai Studio']");
		String hotelNameText = getText(textHotelName);
		System.out.println(hotelNameText);
		
		WebElement textHotelPrize = LocatorByXpath("(//strong[text()='$ 3,540'])[1]");
		String hotelPrizeText = getText(textHotelPrize);
		System.out.println(hotelPrizeText);
		
		WebElement btnContinue = LocatorByXpath("//a[contains(@href,'31?')]");
		elementClick(btnContinue);
		okAlert();
		
		WebElement textBookHotelName = LocatorByXpath("//h2[contains(text(),'Book Hotel')]");
		String bookHotelNameText = getText(textBookHotelName);
		System.out.println(bookHotelNameText);
		
		WebElement radioBtnSelf = LocatorById("own");
		radioBtnSelf.click();
		WebElement ddnSaluation = LocatorById("user_title");
		selectOptionByIndex(ddnSaluation, 1);
		WebElement txtFirstName = LocatorById("first_name");
		elementSendkeys(txtFirstName, "Dinesh");
		WebElement txtLastName = LocatorById("last_name");
		elementSendkeys(txtLastName, "Kumar");
		WebElement txtUserPhone = LocatorById("user_phone");
		elementSendkeys(txtUserPhone, "7010269582");
		WebElement txtUserEmail = LocatorById("user_email");
		elementSendkeys(txtUserEmail, "dine@gmail.com");
		
		WebElement checkBoxGst = LocatorById("gst");
		elementClick(checkBoxGst);
		WebElement txtGstNo = LocatorById("gst_registration");
		elementSendkeys(txtGstNo, "9043592058");
		WebElement txtCompanyName = LocatorById("company_name");
		elementSendkeys(txtCompanyName, "Greens Tech OMR Branch");
		WebElement txtCompanyAdd = LocatorById("company_address");
		elementSendkeys(txtCompanyAdd, "Thoraipakkam");
		WebElement btnNext = LocatorById("step1next");
		elementClick(btnNext);
		
		WebElement checkBoxSpecialReq = LocatorById("bed");
		elementClick(checkBoxSpecialReq);
		WebElement btnNext2 = LocatorById("step2next");
		elementClick(btnNext2);
		
		WebElement btnPaymentMethod = LocatorByXpath("//div[@class='credit-card pm']");
		elementClick(btnPaymentMethod);
		WebElement btnSubmit = LocatorById("submitBtn");
		elementClick(btnSubmit);
		
		WebElement textInvalidPaymentType = LocatorById("invalid-payment_type");
		String invalidPaymentTypeText = getText(textInvalidPaymentType);
		System.out.println(invalidPaymentTypeText);
		
		WebElement textInvalidCardType = LocatorById("invalid-card_type");
		String invalidCardTypeText = getText(textInvalidCardType);
		System.out.println(invalidCardTypeText);
		
		WebElement textInvalidCardNo = LocatorById("invalid-card_no");
		String invalidCardNoText = getText(textInvalidCardNo);
		System.out.println(invalidCardNoText);
		
		WebElement textInvalidCardName = LocatorById("invalid-card_name");
		String invalidCardNameText = getText(textInvalidCardName);
		System.out.println(invalidCardNameText);
		
		WebElement textInvalidCardMonth = LocatorById("invalid-card_month");
		String invalidCardMonthText = getText(textInvalidCardMonth);
		System.out.println(invalidCardMonthText);
		
		WebElement textInvalidCvv = LocatorById("invalid-cvv");
		String invalidCvvText = getText(textInvalidCvv);
		System.out.println(invalidCvvText);
		

}
	public static void main(String[] args) {
		CardDetailsErrorMsg cardDetailsErrorMsg= new  CardDetailsErrorMsg();
		cardDetailsErrorMsg.paymentDetails();
	}
}
