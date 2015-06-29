package com.stevex86.napper.http.elements.content;

public class TextContent implements Content {

    private String content;

    public TextContent() {
        content = "";
    }

    public TextContent(String content) {
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
