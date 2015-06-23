package com.stevex86.napper.http.elements.content;

import java.util.HashMap;

public class FormContent implements Content {

    private HashMap<String, String> content;

    public FormContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

}
