package com.bizzabo.provider.mailchimp.api;

public class APIV3Resource extends APIResource
{
	private static final String ver = "/3.0";
	protected String token;
	protected String endpoint;

	public APIV3Resource(String endpoint, String token)
	{
		super(token);
		this.endpoint = endpoint + ver;
	}

	@Override
	String getEndpoint()
	{
		return endpoint;
	}
	
}
