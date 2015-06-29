package com.stevex86.napper.http.elements.content;

import java.util.HashMap;
import java.util.Map;

public class ParameterQueryContent implements QueryContent {

    private Map<String, ?> content;

    public ParameterQueryContent() {
        content = new HashMap<String, Object>();
    }

    @Override
    public String getQueryString() {
        return null;
    }

}
