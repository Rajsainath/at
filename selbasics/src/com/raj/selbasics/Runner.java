package com.raj.selbasics;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		Helper.launchBrowser(TestData.url);
		Helper.verifyTitle(TestData.expectedhomepagetitle);
		//Thread.sleep(3000);
		Helper.clickMobileMenu(Elements.xpathmobilemenu);
		Helper.verifyTitle(TestData.expectedmobilepagetitle);
		Helper.dropDown(Elements.xpathdropdown, TestData.text);
		Helper.sortproducts(Elements.xpathproducts);
		Helper.closeBrowser();

	}

}
