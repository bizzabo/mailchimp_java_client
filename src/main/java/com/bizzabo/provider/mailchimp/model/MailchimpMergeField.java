package com.bizzabo.provider.mailchimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailchimpMergeField extends MailchimpResource
{
	private Integer mergeId;
	private String tag;
	private String type;
	private Boolean required;
	private String defaultValue;
	private String name;
	
	@JsonProperty("public")
	private Boolean publicField;
	
	private MailchimpOptions options;
	
	private Integer totalItems;
	private String helpText;
	private String listId;
	
	
	
	public MailchimpMergeField()
	{
	}
	
	
	public MailchimpMergeField(String tag, String type, Boolean required, String name)
	{
		super();
		this.tag = tag;
		this.type = type;
		this.required = required;
		this.name = name;
	}


	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getHelpText()
	{
		return helpText;
	}

	public void setHelpText(String helpText)
	{
		this.helpText = helpText;
	}

	public String getListId()
	{
		return listId;
	}

	public void setListId(String listId)
	{
		this.listId = listId;
	}

	public Integer getMergeId()
	{
		return mergeId;
	}

	public void setMergeId(Integer mergeId)
	{
		this.mergeId = mergeId;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Boolean getRequired()
	{
		return required;
	}

	public void setRequired(Boolean required)
	{
		this.required = required;
	}

	public String getDefaultValue()
	{
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue)
	{
		this.defaultValue = defaultValue;
	}

	public Boolean getPublicField()
	{
		return publicField;
	}

	public void setPublicField(Boolean publicField)
	{
		this.publicField = publicField;
	}

	public MailchimpOptions getOptions()
	{
		return options;
	}

	public void setOptions(MailchimpOptions options)
	{
		this.options = options;
	}

	public Integer getTotalItems()
	{
		return totalItems;
	}

	public void setTotalItems(Integer totalItems)
	{
		this.totalItems = totalItems;
	}
	

}
