package com.stevex86.napper.response;

import com.stevex86.napper.http.elements.content.BodyContent;
import com.stevex86.napper.http.elements.header.Header;

import java.util.HashSet;
import java.util.Set;

public class Response {

    private Set<Header> headers;
    private BodyContent bodyContent;
    private int responseCode;

    public Response() {
        headers = new HashSet<Header>();
    }

    public void setBodyContent(BodyContent bodyContent) {
        this.bodyContent = bodyContent;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public Set<Header> getHeaders() {
        return headers;
    }

    public BodyContent getBodyContent() {
        return bodyContent;
    }

    public int getResponseCode() {
        return responseCode;
    }

}
