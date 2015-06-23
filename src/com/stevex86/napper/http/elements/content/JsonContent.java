package com.stevex86.napper.http.elements.content;

// TODO: Figure out if I want to use org.JSON or Google's GSON

public class JsonContent implements Content {

    public JsonContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

    @Override
    public String getMimeType() {
        return "application/json";
    }

}
