package org.java_playground.lld.creational_patterns.builder_pattern.builders;

import org.java_playground.lld.creational_patterns.builder_pattern.MethodEnum;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Why is that in builder pattern, we don't have setter methods in the Product for which we are creating builder class, and we have to use the same set of attributes in the builder class to instantiate a few, and then while calling build(), we create a new instance of the Product object?
 * In the builder pattern, setter methods are avoided in the Product to ensure immutability and encapsulation. The builder class collects all necessary attributes, allowing step-by-step configuration. When build() is called, it creates a fully initialized Product instance, often via a constructor or factory method, ensuring the Product is always in a valid state and cannot be modified after creation. This prevents inconsistent or partially constructed objects and enforces a clear separation between object construction and usage.
 */
public class HTTPRequest {
    // Making everything final to ensure immutability
    // Required
    private final String url;
    private final MethodEnum method;

    // Optional
    private final Map<String, String> headers;
    private final Map<String, String> body;
    private final Map<String, String> queryParameters;
    private final int timeout;

    // Making constructor private so that only builder can access the constructor
    private HTTPRequest(HTTPRequestBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers != null ? Map.copyOf(builder.headers) : Map.of();
        this.body = builder.body != null ? Map.copyOf(builder.body) : Map.of();
        this.queryParameters = builder.queryParameters != null ? Map.copyOf(builder.queryParameters) : Map.of();
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParameters +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class HTTPRequestBuilder {
        // Required
        private final String url;
        private final MethodEnum method;

        // Optional
        private Map<String, String> headers;
        private Map<String, String> body;
        private Map<String, String> queryParameters;
        private int timeout;

        public HTTPRequestBuilder(String url, MethodEnum method) {
            this.url = Objects.requireNonNull(url, "URL cannot be null");
            this.method = method != null ? method : MethodEnum.GET;
        }

        public HTTPRequestBuilder setHeaders(HashMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public HTTPRequestBuilder setBody(HashMap<String, String> body) {
            this.body = body;
            return this;
        }

        public HTTPRequestBuilder setQueryParameters(HashMap<String, String> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public HTTPRequestBuilder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HTTPRequest build() {
            return new HTTPRequest(this);
        }
    }
}
