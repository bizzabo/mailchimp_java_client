
package com.bizzabo.provider.mailchimp.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 
 * @author zachishema
 *
 */
public abstract class APIResource
{

	private static final String CONTENT_LENGTH = "Content-Length";
	private static final String POST = "POST";
	private static final String APPLICATION_JSON = "application/json";
	private static final String CONTENT_TYPE = "Content-Type";
	private static final String O_AUTH = "OAuth ";
	private static final String AUTHORIZATION = "Authorization";
	private static final String GET = "GET";

	abstract String getEndpoint();

	private String token;
	
	public APIResource(String token)
	{
		this.token = token;
	}
	
	private static final Logger logger = LoggerFactory.getLogger(APIResource.class);

	protected <T> T postRequest(String targetUrl, String payload, Class<T> clazz)
	{
		HttpURLConnection connection = null;
		try {
			// Create connection
			URL url = new URL(getEndpoint()+targetUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(POST);
			connection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON);
			connection.setRequestProperty(AUTHORIZATION, O_AUTH+token);
			connection.setRequestProperty(CONTENT_LENGTH, Integer.toString(payload.getBytes().length));

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(payload);
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder();
			
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
			}
			rd.close();
			String body = response.toString();
			T resource = APIUtils.JSON.readValue(body, clazz);
			return resource;

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("failed to execute request: {}", targetUrl, e);
			return null;
		}
		finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
	
	@SuppressWarnings("rawtypes")
	protected <T> T getRequest(String targetUrl, TypeReference typeReference)
	{
		HttpURLConnection connection = null;
		try {
			// Create connection
			URL url = new URL(getEndpoint()+targetUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(GET);
			connection.setRequestProperty(AUTHORIZATION, O_AUTH+token);
			connection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON);

			int responseCode = connection.getResponseCode();
			logger.debug("response of {} for url: {}", responseCode,targetUrl);

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder();
			
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
			}
			rd.close();
			String body = response.toString();
			logger.info(body);
			T resource = APIUtils.JSON.readValue(body, typeReference);
			return resource;

		}
		catch (IOException e) {
			logger.error("failed to execute request: {}", targetUrl, e);
			return null;
		}
		finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
	
	protected <T> T getRequest(String targetUrl, Class<T> clazz)
	{
		HttpURLConnection connection = null;
		try {
			// Create connection
			URL url = new URL(getEndpoint()+targetUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(GET);
			connection.setRequestProperty(AUTHORIZATION, O_AUTH+token);
			connection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON);

			int responseCode = connection.getResponseCode();
			logger.debug("response of {} for url: {}", responseCode,targetUrl);

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder();
			
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
			}
			rd.close();
			String body = response.toString();
			T resource = APIUtils.JSON.readValue(body, clazz);
			return resource;

		}
		catch (IOException e) {
			logger.error("failed to execute request: {}", targetUrl, e);
			return null;
		}
		finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

}
