package com.stevex86.napper.http.elements.method;

public class Post implements RequestMethod {

    @Override
    public String getCanonicalName() {
        return "POST";
    }

}
