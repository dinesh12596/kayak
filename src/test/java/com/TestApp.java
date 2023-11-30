package com;

import org.openqa.selenium.WebElement;

public class TestApp extends BaseClass {
	public void bookHotel() throws InterruptedException {
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
		WebElement ddnPaymentType = LocatorById("payment_type");
		selectOptionByIndex(ddnPaymentType, 1);
		WebElement ddnCardType = LocatorById("card_type");
		selectOptionByIndex(ddnCardType, 1);
		WebElement txtCardNo = LocatorById("card_no");
		elementSendkeys(txtCardNo, "5555555555552222");
		WebElement txtCardName = LocatorById("card_name");
		elementSendkeys(txtCardName, "jdk");
		WebElement ddnExMonth = LocatorById("card_month");
		selectOptionByIndex(ddnExMonth, 5);
		WebElement ddnExYear = LocatorById("card_year");
		selectOptionByIndex(ddnExYear, 1);
		WebElement txtCardCvv = LocatorById("cvv");
		elementSendkeys(txtCardCvv, "658");
		WebElement btnSubmit = LocatorById("submitBtn");
		elementClick(btnSubmit);
		
		WebElement textBookingConfirm = LocatorByName("booking-code");
		String bookingConfirmText = getText(textBookingConfirm);
		System.out.println(bookingConfirmText);
		WebElement textBookingId = LocatorByXpath("//strong[contains(text(),'#')]");
		String bookingIdText = getText(textBookingId);
		String bookingId = bookingIdText.replace("#", "");
		WebElement textBookedHotel = LocatorByXpath("//p[text()='Hotel ']");
		String bookedHotelText = getText(textBookedHotel);
		System.out.println(bookedHotelText);
		
		WebElement btnProfile = LocatorByXpath("//a[@data-testid='username']");
		elementClick(btnProfile);
		WebElement btnMyAcc = LocatorByXpath("//a[text()='My Account']");
		elementClick(btnMyAcc);
		WebElement textBookings = LocatorByXpath("//h4[contains(text(),Bookings)]");
		String bookingsText = getText(textBookings);
		System.out.println(bookingsText);
		WebElement txtSearch = LocatorByName("search");
		elementSendkeys(txtSearch, bookingId);
		Thread.sleep(1500);
		WebElement textBookedHotelNameAndBookingNo;
		textBookedHotelNameAndBookingNo = LocatorByXpath("//a[contains(@href,'https://omrbranch.com/view-booking')]");
		String bookedHotelNameAndBookingNoText;
		bookedHotelNameAndBookingNoText = getText(textBookedHotelNameAndBookingNo);
		System.out.println(bookedHotelNameAndBookingNoText);
		WebElement textBookedHotelPrize;
		textBookedHotelPrize = LocatorByXpath("//strong[@class='total-prize']");
		String bookedHotelPrizeText;
		bookedHotelPrizeText = getText(textBookedHotelPrize);
		System.out.println(bookedHotelPrizeText);

		WebElement btnEdit = LocatorByXpath("//button[text()='Edit']");
		elementClick(btnEdit);
		WebElement btnEditCheckIn = LocatorByName("check_in");
		elementClick(btnEditCheckIn);
		WebElement checkInDate = LocatorByXpath("//a[text()='28']");
		elementClick(checkInDate);
		WebElement btnCofirm = LocatorByXpath("//button[text()='Confirm']");
		elementClick(btnCofirm);
		WebElement textAlertMsg;
		textAlertMsg = LocatorByXpath("//li[@class='alertMsg']");
		String alertMsgText;
		alertMsgText = getText(textAlertMsg);
		System.out.println(alertMsgText);

		WebElement txtSearch2 = LocatorByName("search");
		elementSendkeys(txtSearch2, bookingId);
		Thread.sleep(1500);
		textBookedHotelNameAndBookingNo = LocatorByXpath("//a[contains(@href,'https://omrbranch.com/view-booking')]");
		bookedHotelNameAndBookingNoText = getText(textBookedHotelNameAndBookingNo);
		System.out.println(bookedHotelNameAndBookingNoText);
		textBookedHotelPrize = LocatorByXpath("//strong[@class='total-prize']");		
		bookedHotelPrizeText = getText(textBookedHotelPrize);
		System.out.println(bookedHotelPrizeText);
		
		WebElement btnCancel = LocatorByXpath("//a[text()='Cancel']");
		elementClick(btnCancel);
		okAlert();
		textAlertMsg = LocatorByXpath("//li[@class='alertMsg']");
		alertMsgText = getText(textAlertMsg);
		System.out.println(alertMsgText);
		
				
}
	
	public void hotelBooking() {
		System.out.println("Hotel Booking");
		
	} 
	


	public static void main(String[] args) throws InterruptedException {
		TestApp app = new TestApp();
		app.bookHotel();
	}
}
