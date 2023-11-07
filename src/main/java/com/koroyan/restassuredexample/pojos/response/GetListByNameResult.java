package com.koroyan.restassuredexample.pojos.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "GetListByNameResult")
public class GetListByNameResult {
    private List<PersonIdentification> personsList;

    public GetListByNameResult() {
    }

    public GetListByNameResult(List<PersonIdentification> personsList) {
        this.personsList = personsList;
    }

    @XmlElement(name = "PersonIdentification")
    public List<PersonIdentification> getPersonsList() {
        return personsList;
    }

    public void setPersonsList(List<PersonIdentification> personsList) {
        this.personsList = personsList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
