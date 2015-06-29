package com.stevex86.napper.http.elements.content;

import java.util.HashMap;
import java.util.Map;

public class ParameterContent implements Content {

    private Map<String, ?> content;

    public ParameterContent() {
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
