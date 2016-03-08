package com.bizzabo.provider.mailchimp;

import java.util.List;

import com.bizzabo.provider.mailchimp.api.MailchimpInterest;
import com.bizzabo.provider.mailchimp.model.MailchimpResource;

public class MailchimpInterests extends MailchimpResource
{
	private Integer totalItems;
	private String categoryId;
	private String listId;

	private List<MailchimpInterest> interests;

	public List<MailchimpInterest> getInterests()
	{
		return interests;
	}

	public void setInterests(List<MailchimpInterest> interests)
	{
		this.interests = interests;
	}

	public Integer getTotalItems()
	{
		return totalItems;
	}

	public void setTotalItems(Integer totalItems)
	{
		this.totalItems = totalItems;
	}

	public String getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(String categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getListId()
	{
		return listId;
	}

	public void setListId(String listId)
	{
		this.listId = listId;
	}

}
