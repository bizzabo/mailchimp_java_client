package com.bizzabo.provider.mailchimp.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class APIUtils
{
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
			Reader decoder = new InputStreamReader(ua, "UTF8");
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

}
