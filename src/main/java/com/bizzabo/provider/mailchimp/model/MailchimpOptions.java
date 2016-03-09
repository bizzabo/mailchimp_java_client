package com.bizzabo.provider.mailchimp.model;

import java.util.List;

public class MailchimpOptions
{
	private Integer defaultCountry;
	private String phoneFormat;
	private String dateFormat;
	private List<String> choices;
	private Integer size;
	
	public Integer getDefaultCountry()
	{
		return defaultCountry;
	}
	public void setDefaultCountry(Integer defaultCountry)
	{
		this.defaultCountry = defaultCountry;
	}
	public String getPhoneFormat()
	{
		return phoneFormat;
	}
	public void setPhoneFormat(String phoneFormat)
	{
		this.phoneFormat = phoneFormat;
	}
	public String getDateFormat()
	{
		return dateFormat;
	}
	public void setDateFormat(String dateFormat)
	{
		this.dateFormat = dateFormat;
	}
	public List<String> getChoices()
	{
		return choices;
	}
	public void setChoices(List<String> choices)
	{
		this.choices = choices;
	}
	public Integer getSize()
	{
		return size;
	}
	public void setSize(Integer size)
	{
		this.size = size;
	}
	
	
}
