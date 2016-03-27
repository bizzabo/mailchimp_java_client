package com.bizzabo.provider.mailchimp;

import com.bizzabo.provider.mailchimp.api.BatchesV3API;
import com.bizzabo.provider.mailchimp.api.ListsV3API;

public class Mailchimp
{

	private ListsV3API lists;
	private BatchesV3API batches;
	
	public Mailchimp(String endpoint, String token)
	{
		lists = new ListsV3API(endpoint,token);
		batches = new BatchesV3API(endpoint, token);
	}

	public ListsV3API lists(){
		return lists;
	}
	
	public BatchesV3API batches(){
		return batches;
	}
	
}
