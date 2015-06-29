package com.stevex86.napper.http.elements.content;

public class JsonBodyContent implements BodyContent {

    private String json;

    public JsonBodyContent(String json) {
        this.json = json;
    }

    @Override
    public String getOutputString() {
        return json;
    }

    @Override
    public String getMimeType() {
        return "application/json";
    }

}
