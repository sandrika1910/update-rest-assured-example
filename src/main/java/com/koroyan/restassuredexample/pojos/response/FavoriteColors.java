package com.koroyan.restassuredexample.pojos.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FavoriteColors")
public class FavoriteColors {
    private String favoriteColorsItem;

    public FavoriteColors(){}
    public FavoriteColors(String favoriteColorsItem) {
        this.favoriteColorsItem = favoriteColorsItem;
    }

    @XmlElement(name = "FavoriteColorsItem")
    public String getFavoriteColorsItem() {
        return favoriteColorsItem;
    }

    public void setFavoriteColorsItem(String favoriteColorsItem) {
        this.favoriteColorsItem = favoriteColorsItem;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}


