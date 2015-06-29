package com.stevex86.napper.http.elements.content;

import java.util.HashMap;
import java.util.Map;

public class ParameterBodyContent implements BodyContent {

    private Map<String, ?> content;

    public ParameterBodyContent() {
        content = new HashMap<String, Object>();
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
