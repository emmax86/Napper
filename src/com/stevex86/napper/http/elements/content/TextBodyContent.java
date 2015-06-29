package com.stevex86.napper.http.elements.content;

public class TextBodyContent implements BodyContent {

    private String content;

    public TextBodyContent() {
        content = "";
    }

    public TextBodyContent(String content) {
        this.content = content;
    }

    public void append(String content) {
        this.content += content;
    }

    public void appendLine(String content) {
        this.content += content + "\n";
    }

    @Override
    public String getOutputString() {
        return content;
    }

    @Override
    public String getMimeType() {
        return "text/plain";
    }

}
