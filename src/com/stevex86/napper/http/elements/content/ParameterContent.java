package com.stevex86.napper.http.elements.content;

import java.util.Map;

public class ParameterContent implements Content {

    private Map<String, ?> content;

    public ParameterContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

    @Override
    public String getMimeType() {
        return "text/plain";
    }

}
