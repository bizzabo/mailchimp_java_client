package com.bizzabo.provider.mailchimp;

import com.bizzabo.provider.mailchimp.api.ListsV3API;

public class Mailchimp
{

	private ListsV3API lists;
	
	public Mailchimp(String endpoint, String token)
	{
		lists = new ListsV3API(endpoint,token);
	}

	public ListsV3API lists(){
		return lists;
	}
	
}
