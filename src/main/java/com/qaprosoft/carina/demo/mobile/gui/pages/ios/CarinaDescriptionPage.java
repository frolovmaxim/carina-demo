package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CarinaDescriptionPageBase.class)
public class CarinaDescriptionPage extends CarinaDescriptionPageBase {

	@FindBy(xpath = "name = 'CARINA' AND type = 'XCUIElementTypeStaticText'")
	@Predicate
	private ExtendedWebElement webViewTitle;

	public CarinaDescriptionPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return webViewTitle.isElementPresent();
	}

}
