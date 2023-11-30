package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		
		WebElement btnGrocery = LocatorByXpath("//a[text()='Grocery']");
		elementClick(btnGrocery);
		
		WebElement txtSearchGro = driver.findElement(By.id("search"));
		txtSearchGro.sendKeys("nuts");
		
		WebElement btnSearchGro = driver.findElement(By.xpath("//button[@data-testid='searchbtn']"));
		btnSearchGro.click();
		
		WebElement searchResults = driver.findElement(By.xpath("//h5[contains(text(),'Search Result')]"));
		String searchTextGro = searchResults.getText();
		System.out.println(searchTextGro); 

		WebElement btnYogabars = driver.findElement(By.xpath("//a[contains(@class,'addBtn-17')]"));
		btnYogabars.click();
		
		WebElement btnAdd = driver.findElement(By.id("cart-21"));
		btnAdd.click();
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		WebElement btnGoToCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		executor.executeScript("arguments[0].click()", btnGoToCart);
		
		WebElement myCart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
		String myCartText = myCart.getText();
		System.out.println(myCartText);
		
		WebElement btnAddress = driver.findElement(By.xpath("//div[@data-target='#addressModal']"));
		btnAddress.click();
		
		WebElement ddnAddressType = driver.findElement(By.id("address_type"));
		Select addType = new Select(ddnAddressType);
		addType.selectByIndex(3);
		
		WebElement txtFirstNameGro = driver.findElement(By.name("first_name"));
		txtFirstNameGro.sendKeys("Dinesh");
		
		WebElement txtLastNameGro = driver.findElement(By.name("last_name"));
		txtLastNameGro.sendKeys("Kumar");
		
		WebElement txtMobileNo = driver.findElement(By.name("mobile"));
		txtMobileNo.sendKeys("7236598109");
		
		WebElement txtAddLine1 = driver.findElement(By.name("apartment"));
		txtAddLine1.sendKeys("No:58");
		
		WebElement txtAddLine2 = driver.findElement(By.name("address"));
		txtAddLine2.sendKeys("Madhavaram");
		
		WebElement ddnStateGro = driver.findElement(By.name("state"));
		Select state= new Select(ddnStateGro);
		state.selectByIndex(35);
		
		WebElement ddnCity = driver.findElement(By.name("city"));
		Select city = new Select(ddnCity);
		city.selectByValue("3659");
		
		WebElement btnZipcode = driver.findElement(By.name("zipcode"));
		btnZipcode.sendKeys("600001");
		
		WebElement btnSave = driver.findElement(By.xpath("//button[contains(@class,'saveAddress')]"));
		btnSave.click();
		
		Thread.sleep(2000);
		WebElement btnDebitCard = driver.findElement(By.xpath("//option[text()=' Debit Card ']"));
		btnDebitCard.click();
		
		WebElement btnVisa = driver.findElement(By.xpath("//label[@for='visa_card']"));
		btnVisa.click();
		
		WebElement txtCardNoGro = driver.findElement(By.name("card_no"));
		txtCardNoGro.sendKeys("5555555555552222");
		
		WebElement ddnMonth = driver.findElement(By.id("month"));
		Select month = new Select(ddnMonth);
		month.selectByIndex(6);
		
		WebElement ddnYear = driver.findElement(By.id("year"));
		Select year= new Select(ddnYear);
		year.selectByIndex(3);
		
		WebElement txtCvv = driver.findElement(By.name("cvv"));
		txtCvv.sendKeys("655");
		
		WebElement btnPlaceOrder = driver.findElement(By.id("placeOrder"));
		btnPlaceOrder.click();
		
		WebElement orderNo = driver.findElement(By.xpath("(//p[@class='font18 color20 fontSemiBold mb-0'])[1]"));
		String text = orderNo.getText();
		System.out.println(text);
		
		WebElement order = driver.findElement(By.xpath("(//span[@class='font16 fontNormal color36'])[1]"));
		String text2 = order.getText();
		System.out.println(text2);

		
}
	public static void main(String[] args) throws InterruptedException {
		TestApp app = new TestApp();
		app.bookHotel();
	}
}
