package com.bizzabo.provider.mailchimp.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class APIUtils
{
	private static final Logger logger = LoggerFactory.getLogger(APIResource.class);

	private static final String UTF8 = "UTF8";
	private static final String EMPTY = "";
	public static ObjectMapper JSON;
	
	static {
		JSON = new ObjectMapper();
		JSON.setPropertyNamingStrategy(new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy());
		JSON.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		JSON.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		JSON.setSerializationInclusion(Include.NON_NULL);
	}
	
	public static String getTargzContentFromUrl(String url) throws IOException, MalformedURLException, UnsupportedEncodingException
	{
		InputStream openStream = new URL(url).openStream();
		InputStream gzipStream = new GZIPInputStream(openStream);
		TarArchiveInputStream ua = new TarArchiveInputStream(gzipStream);
		//ignore root entry 
		ua.getNextTarEntry();
		TarArchiveEntry entry = ua.getNextTarEntry();
		String body = null;
		if (entry != null) {
			Reader decoder = new InputStreamReader(ua, UTF8);
			BufferedReader reader = new BufferedReader(decoder);
			StringBuilder response = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			body = response.toString();
			reader.close();
		}
		ua.close();
		
		return body;
	}
	
	public static String buildQueryString(Map<String, Object> params){
		String query = EMPTY;
		if (params != null && !params.isEmpty()){
			query="?";
			Iterator<Entry<String, Object>> it = params.entrySet().iterator();
	        while (it.hasNext()) {
	            Entry<String, Object> pairs = it.next();
	            Object value = pairs.getValue();
				try {
					query += URLEncoder.encode(pairs.getKey(), UTF8) + '=';
					if (value != null){
						query+= URLEncoder.encode(value.toString(), UTF8);
					}
				} catch (UnsupportedEncodingException e) {
					logger.error("missing encoding ",e);
				}
	            if (it.hasNext()) { query += '&'; }
	        }
		}
		return query;
	}

}
