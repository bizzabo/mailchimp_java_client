package com.bizzabo.provider.mailchimp;

import com.bizzabo.provider.mailchimp.api.ListsV3API;
import com.bizzabo.provider.mailchimp.model.MailchimpCategories;
import com.bizzabo.provider.mailchimp.model.MailchimpInterest;
import com.bizzabo.provider.mailchimp.model.MailchimpInterests;

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
	
	public static void main(String[] args)
	{
		Mailchimp mailchimp = new Mailchimp("https://us12.api.mailchimp.com", "5ec33fddcd32c8c251b69ff1deb3fa2e");
		MailchimpInterests interests = mailchimp.lists().getInterests("dbf29cd2c2","76ab6cae80");
	}
}
