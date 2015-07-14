package com.stevex86.napper.http.elements.header;

public class Header {

    private String key;
    private String value;

    public Header(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Header(String key, Object value) {
        this(key, value.toString());
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
