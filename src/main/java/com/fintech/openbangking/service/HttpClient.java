package com.fintech.openbangking.service;

import java.io.IOException;


import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClient {
	
	final static String DEFAULT_ENCODING = "UTF-8";
	
	class Header{
		final static String AUTHORIZATION = "Authorization";
	}
	
	private static final String SODAS_IP 	= "101.101.166.237:3030";
	private static final String SODAS_PORT	= "3030";
	
	
	
	public static void sendGet() throws ClientProtocolException, IOException{
		
		CloseableHttpClient	httpClient = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(SODAS_IP);
		
		httpGet.addHeader("Content-type", "application/json");
		
		CloseableHttpResponse	httpResponse = httpClient.execute(httpGet);
		
		System.out.println("GET Response Status");
		System.out.println(httpResponse.getStatusLine().getStatusCode());
		String json = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
		
		System.out.println(json);
		
		httpClient.close();

		
	}
	
}