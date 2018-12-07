package com.ram.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ram.model.Token;

@Service
public class RestClientImpl implements RestClient
{

	@Autowired
	RestTemplate restTemplate;

	final String ROOT_URI = "http://localhost:8080/token";

	
	public void getToken()
	{
		//Set the headers you need send
        final HttpHeaders headers = new HttpHeaders();
        headers.set("grant_type", "client_credentials");
        headers.set("Authorization", "MTIzOmFiYw==");

        //Create a new HttpEntity
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        
        
        //Execute the method writing your HttpEntity to the request
        ResponseEntity<Token> response = restTemplate.exchange(ROOT_URI, HttpMethod.GET, entity, Token.class);        
        System.out.println(response.getBody());        
	}
}
