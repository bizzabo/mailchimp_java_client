package com.bizzabo.provider.mailchimp.model;

public class MailchimpBatchStatus
{
	private Integer statusCode;
	private String operationId;
	private String response;
	private MailchimpApiResponse jsonResponse;
	
	public Integer getStatusCode()
	{
		return statusCode;
	}
	public void setStatusCode(Integer statusCode)
	{
		this.statusCode = statusCode;
	}
	public String getOperationId()
	{
		return operationId;
	}
	public void setOperationId(String operationId)
	{
		this.operationId = operationId;
	}
	
	public MailchimpApiResponse getJsonResponse()
	{
		return jsonResponse;
	}
	
	public void setJsonResponse(MailchimpApiResponse jsonResponse)
	{
		this.jsonResponse = jsonResponse;
	}
	
	public String getResponse()
	{
		return response;
	}
	public void setResponse(String response)
	{
		this.response = response;
	}
	
	

}
