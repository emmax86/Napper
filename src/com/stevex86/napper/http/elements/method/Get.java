package com.stevex86.napper.http.elements.method;

public class Get implements RequestMethod {

    @Override
    public String getCanonicalName() {
        return "GET";
    }

}
