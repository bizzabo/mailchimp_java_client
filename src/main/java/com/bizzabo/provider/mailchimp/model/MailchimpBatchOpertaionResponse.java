package com.bizzabo.provider.mailchimp.model;

public class MailchimpBatchOpertaionResponse
{
	
	private String id;
	private String status;
	private Integer totalOperations;
	private Integer finishedOperations;
	private Integer erroredOperations;
	private String submittedAt;
	private String completedAt;
	private String responseBodyUrl;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public Integer getTotalOperations()
	{
		return totalOperations;
	}
	public void setTotalOperations(Integer totalOperations)
	{
		this.totalOperations = totalOperations;
	}
	public Integer getFinishedOperations()
	{
		return finishedOperations;
	}
	public void setFinishedOperations(Integer finishedOperations)
	{
		this.finishedOperations = finishedOperations;
	}
	public Integer getErroredOperations()
	{
		return erroredOperations;
	}
	public void setErroredOperations(Integer erroredOperations)
	{
		this.erroredOperations = erroredOperations;
	}
	public String getSubmittedAt()
	{
		return submittedAt;
	}
	public void setSubmittedAt(String submittedAt)
	{
		this.submittedAt = submittedAt;
	}
	public String getCompletedAt()
	{
		return completedAt;
	}
	public void setCompletedAt(String completedAt)
	{
		this.completedAt = completedAt;
	}
	public String getResponseBodyUrl()
	{
		return responseBodyUrl;
	}
	public void setResponseBodyUrl(String responseBodyUrl)
	{
		this.responseBodyUrl = responseBodyUrl;
	}
	
	
	
	

}
