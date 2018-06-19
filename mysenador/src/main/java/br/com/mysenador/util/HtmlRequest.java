package br.com.mysenador.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlRequest {

	
	StringBuffer resposta;
	HttpURLConnection con;
	URL urlrequest;
		
	
	
	public void teste(String url) {
		
		try {
			urlrequest = new URL(url);
			con = (HttpURLConnection) urlrequest.openConnection();
		int urlrequestCode = con.getResponseCode();
		if(urlrequestCode != 200){
			System.out.printf("Codigo da resposta do html diferente de 200, %d",urlrequestCode);
			return;
		}
		System.out.printf("Montagem ok %d",urlrequestCode);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}
	
	public String toString(String url) {
		
		this.teste(url);
		String resp;
		resposta = new StringBuffer();
		String inputLine;
		try {
			BufferedReader linha = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while((inputLine = linha.readLine()) !=null) {
				resposta.append(inputLine);
				
			}
			linha.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		resp = resposta.toString();
		return resp;
	}
}
