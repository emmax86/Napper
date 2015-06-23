package com.stevex86.napper.http.elements.content;

import java.util.HashMap;

public class ParameterContent implements Content {

    private HashMap<String, ?> content;

    public ParameterContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

}
