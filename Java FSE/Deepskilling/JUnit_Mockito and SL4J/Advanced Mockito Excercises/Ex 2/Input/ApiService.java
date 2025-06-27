package com.example.mock_api_service;

public class ApiService {
	private RestClient restClient;

    public ApiService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String fetchData() {
        String response = restClient.getResponse();
        return "Fetched " + response;
    }

}
