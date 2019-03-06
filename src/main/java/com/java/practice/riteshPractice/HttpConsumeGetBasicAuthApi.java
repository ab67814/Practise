package com.ritesh.practice.riteshPractice;

import java.io.IOException;
import java.util.Base64;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpConsumeGetBasicAuthApi {

	public static void main(String[] args) {

		String pushUrl = "http://pkr0k7ng3hcw.preview-demoapps.wavemakeronline.com/RM_APP/services/push/notify?message=12";

		try {
			HttpGet request = new HttpGet(pushUrl);
			byte[] encodedAuth = Base64.getEncoder().encode(("Tom:123456").getBytes());
			request.setHeader("AUTHORIZATION", "Basic " + new String(encodedAuth));
			CloseableHttpResponse execute = HttpClientBuilder.create().build().execute(request);
			System.out.println("execute "+execute);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
