package com.bizzabo.provider.mailchimp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailchimpCategory
{
	private String listId;
	private String id;
	private String title;
	private Integer displayOrder;
	private String type;
	
	@JsonProperty("_links")
	private List<MetadataLink> links;
	
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
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public Integer getDisplayOrder()
	{
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder)
	{
		this.displayOrder = displayOrder;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public List<MetadataLink> getLinks()
	{
		return links;
	}
	public void setLinks(List<MetadataLink> links)
	{
		this.links = links;
	}

	
}
