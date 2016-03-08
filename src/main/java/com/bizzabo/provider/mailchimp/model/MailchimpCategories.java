package com.bizzabo.provider.mailchimp.model;

import java.util.List;

public class MailchimpCategories
{
	private String listId;
	private List<MailchimpCategory> categories;
	
	public String getListId()
	{
		return listId;
	}
	public void setListId(String listId)
	{
		this.listId = listId;
	}
	public List<MailchimpCategory> getCategories()
	{
		return categories;
	}
	public void setCategories(List<MailchimpCategory> categories)
	{
		this.categories = categories;
	}
	
	

}
