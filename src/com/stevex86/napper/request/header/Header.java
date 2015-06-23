package com.stevex86.napper.request.header;

public class Header {

    private String headerName;
    private String headerContent;

    public Header(String headerName, String headerContent) {
        this.headerName = headerName;
        this.headerContent = headerContent;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getHeaderContent() {
        return headerContent;
    }

}
