package com.bizzabo.provider.mailchimp.api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.bizzabo.provider.mailchimp.model.MailchimpApiResponse;
import com.bizzabo.provider.mailchimp.model.MailchimpBatchOperations;
import com.bizzabo.provider.mailchimp.model.MailchimpBatchOpertaionResponse;
import com.bizzabo.provider.mailchimp.model.MailchimpBatchStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

public class BatchesV3API extends APIV3Resource
{

	public BatchesV3API(String endpoint, String token)
	{
		super(endpoint, token);
	}

	public MailchimpBatchOpertaionResponse executeBatch(MailchimpBatchOperations batch) throws JsonProcessingException {
		return postRequest("/batches",APIUtils.JSON.writeValueAsString(batch),MailchimpBatchOpertaionResponse.class);
	}
	
	public MailchimpBatchOpertaionResponse get(String batchId){
		return getRequest("/batches/"+batchId, MailchimpBatchOpertaionResponse.class);
	}
	
	public List<MailchimpBatchStatus> getBatchResponseBody(String url) throws MalformedURLException, IOException{
		
			String body = APIUtils.getTargzContentFromUrl(url);
			List<MailchimpBatchStatus> list = APIUtils.JSON.readValue(body, new TypeReference<List<MailchimpBatchStatus>>(){});
			if (list != null){
				for (MailchimpBatchStatus mailchimpBatchStatus : list) {
					String response = mailchimpBatchStatus.getResponse();
					if (mailchimpBatchStatus.getStatusCode() != 200 && response != null){
						mailchimpBatchStatus.setJsonResponse(APIUtils.JSON.readValue(response, MailchimpApiResponse.class));
					}
				}
			}
			return list;
			
	}

}
