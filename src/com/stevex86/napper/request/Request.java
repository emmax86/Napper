package com.stevex86.napper.request;

import com.stevex86.napper.http.elements.content.Content;
import com.stevex86.napper.http.elements.header.Header;
import com.stevex86.napper.http.elements.method.RequestMethod;

import java.util.Set;

public class Request {

    private RequestMethod requestMethod;
    private Set<Header> headers;
    private Content content;

    public Request(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }


    public void addHeader(Header header) {
        headers.add(header);
    }

    public void addHeaders(Set<Header> headers) {
        this.headers.addAll(headers);
    }

}
