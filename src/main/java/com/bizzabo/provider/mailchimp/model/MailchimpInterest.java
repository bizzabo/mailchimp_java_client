package com.bizzabo.provider.mailchimp.model;

public class MailchimpInterest extends MailchimpResource
{
	private String categoryId;
	private String listId;
	private String id;
	private String name;
	private Integer displayOrder;
	
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
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Integer getDisplayOrder()
	{
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder)
	{
		this.displayOrder = displayOrder;
	}
	
}
