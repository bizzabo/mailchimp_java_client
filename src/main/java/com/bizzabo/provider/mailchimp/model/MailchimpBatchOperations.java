package com.bizzabo.provider.mailchimp.model;

import java.util.List;

public class MailchimpBatchOperations
{

	List<MailchimpBatchOperation> operations;

	public MailchimpBatchOperations(List<MailchimpBatchOperation> operations)
	{
		this.operations = operations;
	}

	public MailchimpBatchOperations()
	{
	}
	
	public List<MailchimpBatchOperation> getOperations()
	{
		return operations;
	}

	public void setOperations(List<MailchimpBatchOperation> operations)
	{
		this.operations = operations;
	}
	
	
	
}
