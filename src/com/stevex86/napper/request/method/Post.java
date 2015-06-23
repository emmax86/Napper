package com.stevex86.napper.request.method;

public class Post implements RequestMethod {

    @Override
    public String getCanonicalName() {
        return "POST";
    }

}
