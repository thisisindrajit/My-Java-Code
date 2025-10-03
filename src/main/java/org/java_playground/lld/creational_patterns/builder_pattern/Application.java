package org.java_playground.lld.creational_patterns.builder_pattern;

import org.java_playground.lld.creational_patterns.builder_pattern.builders.HTTPRequest;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        HashMap<String, String> headersMap = new HashMap<>();
        headersMap.put("Content-Type", "application/json");

        HashMap<String, String> bodyMap = new HashMap<>();
        bodyMap.put("Name", "Volvo");

        HashMap<String, String> queryParametersMap = new HashMap<>();
        queryParametersMap.put("page", "1");

        // GET Request using Builder Pattern
        HTTPRequest getRequest = new HTTPRequest.HTTPRequestBuilder("https://example.com/api/products", MethodEnum.GET)
                .setHeaders(headersMap)
                .setQueryParameters(queryParametersMap)
                .build();

        // POST Request using Builder Pattern
        HTTPRequest postRequest =new HTTPRequest.HTTPRequestBuilder("https://example.com/api/products/create", MethodEnum.POST)
                .setHeaders(headersMap)
                .setBody(bodyMap)
                .setTimeout(60000)
                .build();

        System.out.println(getRequest.toString());
        System.out.println(postRequest.toString());
    }
}

