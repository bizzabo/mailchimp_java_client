package com.bizzabo.provider.mailchimp.model;

public class MailchimpMember extends MailchimpResource
{
	private String id;
	
	private String uniqueEmailId;
	private String emailClient;
	private String listId;
	private String emailType;
	private MailchimpMemberStatus status;
	
	private MailchimpMergeFields mergeFields;
	private MailchimpInterests interests;
	private String language;
	private Boolean vip;
	private MailchimpLocation location;
	private String emailAddress;
	
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getUniqueEmailId()
	{
		return uniqueEmailId;
	}
	public void setUniqueEmailId(String uniqueEmailId)
	{
		this.uniqueEmailId = uniqueEmailId;
	}
	public String getEmailClient()
	{
		return emailClient;
	}
	public void setEmailClient(String emailClient)
	{
		this.emailClient = emailClient;
	}
	public String getListId()
	{
		return listId;
	}
	public void setListId(String listId)
	{
		this.listId = listId;
	}
	public String getEmailType()
	{
		return emailType;
	}
	public void setEmailType(String emailType)
	{
		this.emailType = emailType;
	}
	public MailchimpMemberStatus getStatus()
	{
		return status;
	}
	public void setStatus(MailchimpMemberStatus status)
	{
		this.status = status;
	}
	public MailchimpMergeFields getMergeFields()
	{
		return mergeFields;
	}
	public void setMergeFields(MailchimpMergeFields mergeFields)
	{
		this.mergeFields = mergeFields;
	}
	public MailchimpInterests getInterests()
	{
		return interests;
	}
	public void setInterests(MailchimpInterests interests)
	{
		this.interests = interests;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public Boolean getVip()
	{
		return vip;
	}
	public void setVip(Boolean vip)
	{
		this.vip = vip;
	}
	public MailchimpLocation getLocation()
	{
		return location;
	}
	public void setLocation(MailchimpLocation location)
	{
		this.location = location;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}

	
	
}
