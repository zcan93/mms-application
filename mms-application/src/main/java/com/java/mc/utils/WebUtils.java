package com.java.mc.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpMethod;

public class WebUtils {
	
	public static boolean access(String url, HttpMethod method) throws IOException, URISyntaxException{
		return access(new URI(url), method);
	}
	public static boolean check(String url, HttpMethod method) {
		try {
			return access(new URI(url), method);
		} catch (IOException | URISyntaxException e) {
			return false;
		}
	}
	
	/**
	 * try get something from string url
	 * @param url
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static boolean access(String url) throws IOException, URISyntaxException{
		return access(new URI(url));
	}
	
	public static boolean check(String url){
		try {
			return access(new URI(url));
		} catch (IOException | URISyntaxException e) {
			return false;
		}
	}
	
	/**
	 * try get something from string url
	 * @param url
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static boolean access(URI url) throws IOException{
		return access(url, HttpMethod.GET);
	}

	private static boolean access(URI url, HttpMethod method) throws IOException{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse proxyresponse = null;
		HttpEntity responseEntity = null;
		try {
			RequestBuilder proxyRequest = RequestBuilder.create(method == null ? HttpMethod.GET.toString() : method.toString());
			proxyRequest.setUri(url);
			proxyresponse = httpclient.execute(proxyRequest.build());
			responseEntity = proxyresponse.getEntity();
			EntityUtils.consume(responseEntity);
			int code = proxyresponse.getStatusLine().getStatusCode();
			if(code == HttpStatus.SC_OK){
				return true;
			}
			return false;
		} finally {
			if(responseEntity != null){
				EntityUtils.consume(responseEntity);
			}
			if (proxyresponse != null) {
				try {
					proxyresponse.close();
				} catch (IOException e) {
				}
			}
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
