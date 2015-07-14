package com.stevex86.napper.http.elements.route;

public class Route {

    private String route;
    private String URL;
    private int port;

    public Route(String route) {
        this.route = route;
        String[] tokens = route.split(":");
        if (tokens.length > 2 && !tokens[2].equals("")) {
            this.port = Integer.parseInt(tokens[2]);
            this.URL = tokens[0] + tokens[1];
        }
        else {
            this.port = tokens[0].equalsIgnoreCase("https") ? 443 : 80;
            this.URL = tokens[0] + tokens[1];
        }
    }

    public boolean isSecure() {
        return route.toLowerCase().startsWith("https");
    }

    public String getURL() {
        return URL;
    }

    public int getPort() {
        return port;
    }

}
