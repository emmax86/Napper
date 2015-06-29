package com.stevex86.napper.http.elements.content;

import java.util.Map;

public class FormContent implements Content {

    private Map<String, ?> content;

    public FormContent() {

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
