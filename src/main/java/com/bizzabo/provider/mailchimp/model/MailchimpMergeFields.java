package com.bizzabo.provider.mailchimp.model;

import java.util.List;

public class MailchimpMergeFields extends MailchimpResource
{
	
	private List<MailchimpMergeField> mergeFields;

	public List<MailchimpMergeField> getMergeFields()
	{
		return mergeFields;
	}

	public void setMergeFields(List<MailchimpMergeField> mergeFields)
	{
		this.mergeFields = mergeFields;
	}

}
