package com.koroyan.restassuredexample.pojos.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "FindPersonResult")
public class FindPersonResult {
    private String name;
    private String SSN;
    private Date DOB;
    private Home home;
    private Office office;
    private FavoriteColors favoriteColors;
    private int age;

    public FindPersonResult(){}

    public FindPersonResult(String name,
                            String SSN,
                            Date DOB,
                            Home home,
                            Office office,
                            FavoriteColors favoriteColors,
                            int age) {
        this.name = name;
        this.SSN = SSN;
        this.DOB = DOB;
        this.home = home;
        this.office = office;
        this.favoriteColors = favoriteColors;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setHome(com.koroyan.restassuredexample.pojos.response.Home home) {
        this.home = home;
    }

    public void setOffice(com.koroyan.restassuredexample.pojos.response.Office office) {
        this.office = office;
    }

    public void setFavoriteColors(com.koroyan.restassuredexample.pojos.response.FavoriteColors favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "SSN")
    public String getSSN() {
        return SSN;
    }

    @XmlElement(name = "DOB")
    public Date getDOB() {
        return DOB;
    }

    @XmlElement(name = "Home")
    public Home getHome() {
        return home;
    }

    @XmlElement(name = "Office")
    public Office getOffice() {
        return office;
    }

    @XmlElement(name = "FavoriteColors")
    public FavoriteColors getFavoriteColors() {
        return favoriteColors;
    }

    @XmlElement(name = "Age")
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
