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

    public FindPersonResult() {
    }

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

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "SSN")
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @XmlElement(name = "DOB")
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @XmlElement(name = "Home")
    public Home getHome() {
        return home;
    }

    public void setHome(com.koroyan.restassuredexample.pojos.response.Home home) {
        this.home = home;
    }

    @XmlElement(name = "Office")
    public Office getOffice() {
        return office;
    }

    public void setOffice(com.koroyan.restassuredexample.pojos.response.Office office) {
        this.office = office;
    }

    @XmlElement(name = "FavoriteColors")
    public FavoriteColors getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(com.koroyan.restassuredexample.pojos.response.FavoriteColors favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    @XmlElement(name = "Age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
