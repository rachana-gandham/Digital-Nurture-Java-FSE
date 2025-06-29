package com.example;

public class MyService {
	private ExternalApi exApi;
	
	public MyService(ExternalApi exApi) {
		this.exApi=exApi;
	}
	
	public String fetchData() {
		return exApi.getData();
	}
}
