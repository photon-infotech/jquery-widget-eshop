package com.photon.phresco.uiconstants;

import java.lang.reflect.Field;

public class JQueryWidgetData {

	private ReadXMLFile readXml;

	//REGISTRATION
	public String REG_FIRSTNAME_VALUE="firstname";
	public String REG_LASTNAME_VALUE="lastname";
	public String REG_EMAIL_VALUE="email";
	public String REG_PASSWORD_VALUE="password";
	public String REG_PHONENUMBER="phonenumber";
	public String REG_SUCCESS_MSG="reg_text-msg";
	
	public String COMMENTS_VALUE="billInfoCommentsValue";
	public String CARDNUMBER_VALUE="cardInfoCardNumberValue";
	public String SECURITYNUMBER_VALUE="cardInfoSecurityNumberValue";
	public String NAMEONCARD_VALUE="cardInfoNameOnCardValue";
	public String PHONENUMBER_VALUE="billInfoPhoneNumberValue";
	public String POSTALCODE_VALUE="billInfoPostCodeValue";
	public String STATE_VALUE="billInfoStateValue";
	public String CITY_VALUE="billInfoCityValue";
	public String ADDRESS2_VALUE="billInfoAddress2Value";
	public String ADDRESS1_VALUE="billInfoAddress1Value";
	public String COMPANY_VALUE="billInfoCompanyValue";
	public String LASTNAME_VALUE="billInfoLastNameValue";
	public String FIRSTNAME_VALUE="billInfoFirstNameValue";
	public String EMAIL_VALUE="billInfoEmailValue";
	
	public JQueryWidgetData() {
		try {
			readXml = new ReadXMLFile();
			readXml.loadJqueryWidgetData();
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField
							.set(this, readXml.getValue((String) localObject));

			}
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}
}
