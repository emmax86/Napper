package com.stevex86.napper.http.connection;

import com.stevex86.napper.http.elements.content.TextBodyContent;
import com.stevex86.napper.http.elements.header.Header;
import com.stevex86.napper.http.elements.route.Route;
import com.stevex86.napper.request.Request;
import com.stevex86.napper.response.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

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

        for (Header entry : request.getHeaders()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }

        if (request.getBodyContent() != null) {
            String outputString = request.getBodyContent().getOutputString();
            connection.setRequestProperty("Content-Length", "" + outputString.getBytes().length);
            connection.setRequestProperty("Content-Type", request.getBodyContent().getMimeType());
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(outputString);
            writer.flush();
            writer.close();
        }

        return connection;
    }

    public Response getResponse() throws IOException {
        HttpURLConnection connection = buildConnection();

        Response response = new Response();
        int responseCode = connection.getResponseCode();
        response.setResponseCode(responseCode);

        BufferedReader in;
        if (responseCode >= 400) {
            in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
        }
        else {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        }

        String inputLine;
        StringBuilder responseBodyBuilder = new StringBuilder();
        while((inputLine = in.readLine()) != null) {
            responseBodyBuilder.append(inputLine);
        }
        in.close();

        Map<String, List<String>> map = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Header header = new Header(entry.getKey(), entry.getValue());
            response.addHeader(header);
        }

        TextBodyContent content = new TextBodyContent();
        content.append(responseBodyBuilder.toString());
        response.setBodyContent(content);

        return response;
    }

}
