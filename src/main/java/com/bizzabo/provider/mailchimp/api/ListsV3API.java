package com.bizzabo.provider.mailchimp.api;

import com.bizzabo.provider.mailchimp.model.MailchimpCategories;
import com.bizzabo.provider.mailchimp.model.MailchimpInterests;
import com.bizzabo.provider.mailchimp.model.MailchimpLists;
import com.bizzabo.provider.mailchimp.model.MailchimpMergeFields;

public class ListsV3API extends APIV3Resource
{
	public ListsV3API(String endpoint, String token)
	{
		super(endpoint,token);
	}
	
	public MailchimpLists get(){
		return getRequest("/lists", MailchimpLists.class);
	}

	public MailchimpCategories getInterestCategories(String listId){
		return getRequest("/lists/"+listId+"/interest-categories", MailchimpCategories.class);
	}
	
	public MailchimpInterests getInterests(String listId, String categoryId){
		return getRequest("/lists/"+listId+"/interest-categories/"+categoryId+"/interests", MailchimpInterests.class);
	}

	public MailchimpMergeFields getListMergeFields(String listId)
	{
		return getRequest("/lists/"+listId+"/merge-fields",MailchimpMergeFields.class);
	}
}
