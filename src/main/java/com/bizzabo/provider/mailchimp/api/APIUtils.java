package com.bizzabo.provider.mailchimp.api;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class APIUtils
{
	public static ObjectMapper JSON;
	
	static {
		JSON = new ObjectMapper();
		JSON.setPropertyNamingStrategy(new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy());
		JSON.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		JSON.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		JSON.setSerializationInclusion(Include.NON_NULL);
	}
	

}
