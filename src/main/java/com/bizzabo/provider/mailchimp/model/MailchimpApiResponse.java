package com.bizzabo.provider.mailchimp.model;

import java.util.List;

public class MailchimpApiResponse
{
	private String type;
	private String title;
	private String detail;
	private Integer status;
	private String instance;
	private List<MailchimpError> errors;
	
	
	public String getInstance()
	{
		return instance;
	}
	public void setInstance(String instance)
	{
		this.instance = instance;
	}
	public List<MailchimpError> getErrors()
	{
		return errors;
	}
	public void setErrors(List<MailchimpError> errors)
	{
		this.errors = errors;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getDetail()
	{
		return detail;
	}
	public void setDetail(String detail)
	{
		this.detail = detail;
	}
	public Integer getStatus()
	{
		return status;
	}
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	
	
	
}
