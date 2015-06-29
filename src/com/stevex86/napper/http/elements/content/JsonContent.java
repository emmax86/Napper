package com.stevex86.napper.http.elements.content;

public class JsonContent implements Content {

    private String json;

    public JsonContent(String json) {
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
