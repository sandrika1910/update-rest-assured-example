package com.koroyan.restassuredexample.pojos.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://tempuri.org")
@XmlRootElement(name = "AddInteger")
public class AddInteger {
    private int arg1;
    private int arg2;

    public AddInteger(){}

    public AddInteger(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @XmlElement(name = "Arg1")
    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    @XmlElement(name = "Arg2")
    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }
}
