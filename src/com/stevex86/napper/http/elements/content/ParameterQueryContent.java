package com.stevex86.napper.http.elements.content;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class ParameterQueryContent implements QueryContent {

    private Map<String, Object> content;
    private String builtQuery;

    public ParameterQueryContent() {
        content = new HashMap<String, Object>();
    }

    public void addEntry(String key, String value) {
        if (key.equals("") || value.equals("")) {
            throw new IllegalArgumentException("Key and value must both be non-empty strings.");
        }
        else {
            content.put(key, value);
            if (builtQuery.equals("")) {
                try {
                    builtQuery += URLEncoder.encode(key, "UTF-8");
                    builtQuery += "=";
                    builtQuery += URLEncoder.encode(value, "UTF-8");
                }
                catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException("System does not support UTF-8 encoding!");
                }
            }
            else {
                try {
                    builtQuery += "&";
                    builtQuery += URLEncoder.encode(key, "UTF-8");
                    builtQuery += "=";
                    builtQuery += URLEncoder.encode(value, "UTF-8");
                }
                catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException("System does not support UTF-8 encoding!");
                }
            }
        }
    }

    public void addEntry(String key, Object value) {
        addEntry(key, value.toString());
    }

    @Override
    public String getQueryString() {
        return builtQuery;
    }

}
