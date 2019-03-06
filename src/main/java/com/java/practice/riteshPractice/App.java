package com.ritesh.practice.riteshPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jose4j.base64url.internal.apache.commons.codec.binary.Base64;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	loopArgument("rit","dinesh","","mahesh");
		// SSLContext sc;
		String url = "http://pkmxpcnvnbp8.cloud.wavemakeronline.com/Dublin_Agent_3_0/services/Dublin/StateMaster?role=Agent";
		try {
			// sc = getSslContext();
			URL address = new URL(url);
			URLConnection conn = address.openConnection();
			conn.setConnectTimeout(30000); // 30 seconds time out

			String user_pass = "sam" + ":" + "agent";
			String encoded = Base64.encodeBase64String(user_pass.getBytes());
			conn.setRequestProperty("Authorization", "Basic " + encoded);

			String line = "";
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			/*
			 * HttpClient client = HttpClientBuilder.create(). setSslcontext(sc). build();
			 * 
			 * HttpGet get = new HttpGet(url); get.setHeader("Content-type",
			 * "application/x-www-form-urlencoded"); List < BasicNameValuePair >
			 * parametersBody = new ArrayList < BasicNameValuePair > ();
			 * parametersBody.add(new BasicNameValuePair("username", "sam"));
			 * parametersBody.add(new BasicNameValuePair("password", "agent1"));
			 * get.setEntity(new UrlEncodedFormEntity(parametersBody, HTTP.UTF_8));
			 * 
			 * HttpResponse response = client.execute(get);
			 */
			// System.out.println("the vaues"+response);

			// BufferedReader rd = new BufferedReader(new
			// InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			
			System.out.println("printing the values =====>");

			if (result != null) {
				String resp = result.toString();
				System.out.println("response------->>>>>  " + resp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
    
    private static void loopArgument (String... args) {
    	for (String arg :args) {
    		System.out.println(arg);
    	}
    	
    }
    
}
