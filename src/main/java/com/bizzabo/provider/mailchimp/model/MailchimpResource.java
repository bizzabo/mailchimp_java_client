package com.bizzabo.provider.mailchimp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailchimpResource
{

	@JsonProperty("_links")
	private List<MetadataLink> links;
	
	public List<MetadataLink> getLinks()
	{
		return links;
	}
	public void setLinks(List<MetadataLink> links)
	{
		this.links = links;
	}
}
