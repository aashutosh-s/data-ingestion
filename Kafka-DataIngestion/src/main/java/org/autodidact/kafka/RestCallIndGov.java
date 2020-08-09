package org.autodidact.kafka;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class RestCallIndGov {

	public String callRestService() throws Exception {
		
		String URL = "mail me @ ashutosh.ypr@gmail.com for url help";
		HttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
		HttpClient httpClient = new HttpClient(connectionManager);
		
		try {
			
			GetMethod postMethod = new GetMethod(URL);
			postMethod.setRequestHeader("Content-type", "application/json");
			httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
			httpClient.executeMethod(postMethod);
			return postMethod.getResponseBodyAsString();
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
