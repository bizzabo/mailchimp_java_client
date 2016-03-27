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
					if (response != null){
						mailchimpBatchStatus.setJsonResponse(APIUtils.JSON.readValue(response, MailchimpApiResponse.class));
					}
				}
			}
			return list;
			
	}
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		System.out.println(APIUtils.JSON.writeValueAsString(new BatchesV3API(null, null).getBatchResponseBody("https://mailchimp-api-batch.s3.amazonaws.com/e46adba711-response.tar.gz?AWSAccessKeyId=AKIAJWOH5BECJQZIEWNQ&Expires=1459091912&Signature=kpD4wle15QzGf9VqdVjMlu1T1DA%3D")));
	}

}
