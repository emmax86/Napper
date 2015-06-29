package com.stevex86.napper.http.elements.content;

import java.util.Map;

public class FormBodyContent implements BodyContent {

    private Map<String, ?> content;

    public FormBodyContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

    @Override
    public String getMimeType() {
        return "application/x-www-form-urlencoded";
    }

}
