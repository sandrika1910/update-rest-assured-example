package com.koroyan.restassuredexample.pojos.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://tempuri.org")
@XmlRootElement(name = "FindPerson")
public class FindPerson {
    private String id;

    public FindPerson() {
    }

    public FindPerson(String id) {
        this.id = id;
    }

    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
