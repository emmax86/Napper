package com.stevex86.napper.http.elements.content;

import java.util.HashMap;

public class JsonContent implements Content {

    private HashMap<String, ?> content;

    public JsonContent() {

    }

    @Override
    public String getOutputString() {
        return null;
    }

}
