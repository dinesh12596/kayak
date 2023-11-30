package com;

import org.openqa.selenium.WebElement;

public class SearchErrorMsg extends BaseClass {
	public void searchHotel() {
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

		switchFrameById("hotelsearch_iframe");
		WebElement btnSearch = LocatorById("searchBtn");
		elementClick(btnSearch);
		switchFrameToWindow();
		
		WebElement textInvalidState = LocatorById("invalid-state");
		String invalidStateText = getText(textInvalidState);
		System.out.println(invalidStateText);
		
		WebElement textInvalidCity = LocatorById("invalid-city");
		String invalidCityText = getText(textInvalidCity);
		System.out.println(invalidCityText);

		WebElement textInvalidCheckIn = LocatorById("invalid-check_in");
		String invalidCheckInText = getText(textInvalidCheckIn);
		System.out.println(invalidCheckInText);

		WebElement textInvalidCheckOut = LocatorById("invalid-check_out");
		String invalidCheckOutText = getText(textInvalidCheckOut);
		System.out.println(invalidCheckOutText);

		WebElement textInvalidNoOfRooms = LocatorById("invalid-no_rooms");
		String invalidNoOfRoomsText = getText(textInvalidNoOfRooms);
		System.out.println(invalidNoOfRoomsText);

		WebElement textInvalidNoOfAdults = LocatorById("invalid-no_adults");
		String invalidNoOfAdultsText = getText(textInvalidNoOfAdults);
		System.out.println(invalidNoOfAdultsText);

		

	}

	public static void main(String[] args) {
		SearchErrorMsg errorMsg = new SearchErrorMsg();
		errorMsg.searchHotel();
	}
}
