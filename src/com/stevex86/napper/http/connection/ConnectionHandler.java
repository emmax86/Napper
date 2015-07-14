package com.stevex86.napper.http.connection;

import com.stevex86.napper.http.elements.header.Header;
import com.stevex86.napper.http.elements.route.Route;
import com.stevex86.napper.request.Request;
import com.stevex86.napper.response.Response;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionHandler {

    private Request request;

    public ConnectionHandler(Request request) {
        this.request = request;
    }

    public HttpURLConnection buildConnection() throws IOException {
        Route route = request.getRoute();
        String routeString = route.getRoute();
        if (request.getQueryContent() != null) {
            routeString += "?" + request.getQueryContent().getQueryString();
        }
        URL requestURL = new URL(routeString);
        HttpURLConnection connection = (HttpURLConnection) requestURL.openConnection();
        connection.setRequestMethod(request.getRequestMethod().getCanonicalName());
        connection.setRequestProperty("charset", "utf-8");
        connection.setUseCaches(false);

        if (request.getBodyContent() != null) {
            String outputString = request.getBodyContent().getOutputString();
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(outputString);
            writer.flush();
            writer.close();
            connection.setRequestProperty("Content-Length", "" + outputString.getBytes().length);
        }

        for (Header entry : request.getHeaders()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }

        return connection;
    }

    public Response getResponse() {
        return null;
    }

}
