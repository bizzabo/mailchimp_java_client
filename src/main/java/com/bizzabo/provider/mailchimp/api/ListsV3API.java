package com.bizzabo.provider.mailchimp.api;

import java.util.Map;

import com.bizzabo.provider.mailchimp.model.MailchimpBatchOperation;
import com.bizzabo.provider.mailchimp.model.MailchimpCategories;
import com.bizzabo.provider.mailchimp.model.MailchimpInterests;
import com.bizzabo.provider.mailchimp.model.MailchimpLists;
import com.bizzabo.provider.mailchimp.model.MailchimpMember;
import com.bizzabo.provider.mailchimp.model.MailchimpMergeFields;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ListsV3API extends APIV3Resource
{
	
	

	public ListsV3API(String endpoint, String token)
	{
		super(endpoint,token);
	}
	
	public MailchimpLists get(Map<String,Object> params){
		return getRequest("/lists",params, MailchimpLists.class);
	}

	public MailchimpCategories getInterestCategories(String listId, Map<String,Object> params){
		String targetUrl = "/lists/"+listId+"/interest-categories";
		
		return getRequest(targetUrl,params, MailchimpCategories.class);
	}
	
	public MailchimpInterests getInterests(String listId, String categoryId,Map<String,Object> params){
		return getRequest("/lists/"+listId+"/interest-categories/"+categoryId+"/interests",params, MailchimpInterests.class);
	}

	public MailchimpMergeFields getListMergeFields(String listId,Map<String,Object> params)
	{
		return getRequest("/lists/"+listId+"/merge-fields",params,MailchimpMergeFields.class);
	}
	
	public MailchimpMember addMember(String listId, MailchimpMember member) throws JsonProcessingException
	{
		
		return putRequest("/lists/"+listId+"/members/"+member.getId(),APIUtils.JSON.writeValueAsString(member),MailchimpMember.class);
	}
	
	public MailchimpBatchOperation buildBatchAddMember(String listId, MailchimpMember member, String operationId, boolean patch) throws JsonProcessingException
	{
		String method = PUT;
		if (patch){
			method = PATCH;
		}
		return new MailchimpBatchOperation(method,"/lists/"+listId+"/members/"+member.getId(),APIUtils.JSON.writeValueAsString(member),operationId);
	}
	
	
}
