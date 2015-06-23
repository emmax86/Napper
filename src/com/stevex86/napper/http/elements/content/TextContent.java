package com.stevex86.napper.http.elements.content;

public class TextContent implements Content {

    private String content;

    public TextContent() {

    }

    @Override
    public String getOutputString() {
        return content;
    }

}
