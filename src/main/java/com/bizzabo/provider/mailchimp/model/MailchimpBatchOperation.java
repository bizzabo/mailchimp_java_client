package com.bizzabo.provider.mailchimp.model;

public class MailchimpBatchOperation
{
	
	private String method;
	private String path;
	private String body;
	private String operationId;
	
	public MailchimpBatchOperation()
	{
	}

	public MailchimpBatchOperation(String method, String path, String body)
	{
		this.method = method;
		this.path = path;
		this.body = body;
	}
	
	public MailchimpBatchOperation(String method, String path, String body, String operationId)
	{
		this.method = method;
		this.path = path;
		this.body = body;
		this.operationId = operationId;
	}
	public String getMethod()
	{
		return method;
	}
	public void setMethod(String method)
	{
		this.method = method;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String body)
	{
		this.body = body;
	}
	public String getOperationId()
	{
		return operationId;
	}
	public void setOperationId(String operationId)
	{
		this.operationId = operationId;
	}
	
	

}
