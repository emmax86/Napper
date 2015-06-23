package com.stevex86.napper.http.elements.content;

import java.util.HashMap;

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
