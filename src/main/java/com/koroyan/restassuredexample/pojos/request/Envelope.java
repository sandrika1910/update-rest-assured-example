package com.koroyan.restassuredexample.pojos.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://schemas.xmlsoap.org/soap/envelope/", propOrder = {"header", "body"})
@XmlRootElement(name = "soapenv:Envelope")
public class Envelope {
    private Header header;
    private Body body;
    public Envelope() {
    }

    public Envelope(Header header, Body body) {
        this.header = header;
        this.body = body;
    }

    @XmlElement(name = "Header")
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    @XmlElement(name = "Body")
    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public static class Header {
    }
}
